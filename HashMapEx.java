import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,Integer> StudentDetails=new HashMap<String,Integer>();
		
		StudentDetails.put("tim",12);
		StudentDetails.put("rim",13);
		StudentDetails.put("jim",14);
		StudentDetails.put("kim",12);
		StudentDetails.put("dim",12);
		StudentDetails.put("zim",11);
		
		for(Map.Entry m:StudentDetails.entrySet())
		{
			System.out.println("key:  "+m.getKey()+"& value : "+m.getValue());
		}
		
		Iterator itr=StudentDetails.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println("key:  "+m1.getKey()+"& value : "+m1.getValue());
		}
		
		
	}

}
