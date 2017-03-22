package sexRatio;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
//import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class SexRatio {
	

	public static class MapClass extends Mapper<LongWritable,Text,Text,Text>{
		
		private Text outputKey = new Text();
		private Text outputValue = new Text();
		
		public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException{
			String row = value.toString();
        	String[] tokens = row.split(",");
        	String age[] = tokens[0].trim().split(":");
            String age1=age[1].trim();
        	String gender = tokens[3];
        	
        	outputKey.set(age1);
        	outputValue.set(gender);
      	  	context.write(outputKey,outputValue);
        }  
		}
	public static class PartPartitioner extends Partitioner < Text, Text >
	   {
	      public int getPartition(Text key, Text value, int numReduceTasks)
	      {
					String parts[] = key.toString().trim().split(",");
	         int age =Integer.parseInt(parts[0]); ;
	    	  
	         
	         if(age<=12) return 0;
	         else if(age>12 && age<=17) return 1;
	         else if(age>18 && age<=40) return 2;
	         else if(age>40 && age<=60) return 3;
	         else if(age>60 && age<=80) return 4;
	         else  return 5;
	         
	      }
	   }
	
	public static class ReduceClass extends Reducer<Text,Text,Text,Text>{
		public void reduce(Iterable<Text> key,Iterable<Text> value,Context context) throws IOException, InterruptedException{
			long malecount = 0;
			long femalecount = 0;
			for(Text val : value){
				String parts[] = val.toString().trim().split(":");
				if(parts[1].trim().equals("\" Female\""))femalecount++;
				else if (parts[1].trim().equals("\" Male\""))malecount++;
			
			}
			long temp1=malecount;
			long temp2=femalecount;
			while(malecount!=femalecount)
			{
				if(malecount>femalecount)
					malecount=malecount-femalecount;
					else femalecount=femalecount-malecount;
				}
			long m=temp1/malecount;
			long n=temp2/malecount;
			String output = "Sex Ratio by age group is "+m+" : "+n;
			context.write(new Text(output),new Text(output));
				
			}
			
			
			
			
		}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException{
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "Sex Ratio by Age Group");
		job.setJarByClass(SexRatio.class);
		job.setMapperClass(MapClass.class);
		job.setReducerClass(ReduceClass.class);
		job.setPartitionerClass(PartPartitioner.class);
		job.setNumReduceTasks(6);
		//job.setPartitionerClass(PartPartitioner.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
