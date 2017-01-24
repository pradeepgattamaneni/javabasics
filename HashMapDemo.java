import java.util.Scanner;

import java.util.HashMap;





class HashMapDemo{ 

  public static void main(String[] args) {
   
  // Create a HashMap
  

   HashMap<Integer, String> hmap = new HashMap<Integer, String>();
 


     //add elements to HashMap
 

    hmap.put(1, "AA");
 
    hmap.put(2, "BB");
 
    hmap.put(3, "CC");

     hmap.put(4, "DD");
 


     // Getting values from HashMap
 

    Scanner s=new Scanner(System.in);


     
     System.out.println("enter key");


     
     int i=s.nextInt();
  

   
     String val=hmap.get(i);
   
  System.out.println("The Value mapped to Key "+i+"is:"+ val);
  

   System.out.println("enter key");
 


    int j=s.nextInt();
   

  String val2=hmap.get(j);
 
    System.out.println("The Value mapped to Key "+j+" is:"+ val2);


  }

}