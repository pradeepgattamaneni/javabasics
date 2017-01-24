import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
		
		LinkedHashSet<String> StudentName=new LinkedHashSet();
		
		StudentName.add("srinu");
		StudentName.add("sai");
		StudentName.add("aish");
		StudentName.add("kunal");
		StudentName.add("venkat");
		StudentName.add("venkat");
		StudentName.add("venkat");
		StudentName.add("null");
		StudentName.add("null");
		
		System.out.println("Name is  "+StudentName);
		
		Iterator itr=StudentName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedHashSet<Integer> StudentAge=new LinkedHashSet<Integer>();
		
		StudentAge.add(12);
		StudentAge.add(22);
		StudentAge.add(45);
		StudentAge.add(12);
		StudentAge.add(16);
		StudentAge.add(15);
		StudentAge.add(17);
		
Iterator itrl=StudentAge.iterator();
		
		while(itrl.hasNext())
		{
			System.out.println(itrl.next());
		}

	}

}
