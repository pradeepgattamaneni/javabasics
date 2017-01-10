import java.io.*;



class Except

{
   
 public static void accept()
   
 {
      
  try{
    
    InputStreamReader is=new InputStreamReader(System.in);
 
       BufferedReader br=new BufferedReader(is);

        System.out.println("enter name");

        String name=br.readLine();
 
       }
  
      catch(IOException ex)

     {
   
 
    
 }
   

 }
  
  
     public static void display() throws IOException


   {
    
 System.out.println(name);

  }

	
public static void main (String[] args)

{
	
accept();
	
display();

}


}
