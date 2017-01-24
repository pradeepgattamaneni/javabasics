import java.util.*;

public class SetInterface {

	public static void main(String[] args) {
		//hashset donot support duplicates
		//hashset donot support any type of order to values
		//hashset support atleast one null value
		HashSet<String> StudentName=new HashSet();
		StudentName.add("srinu");
		StudentName.add("sai");
		StudentName.add("aish");
		StudentName.add("kunal");
		StudentName.add("venkat");
		StudentName.add("venkat");
		StudentName.add("venkat");
		StudentName.add("null");
		StudentName.add("null");
		
		System.out.println(StudentName);
		
		Iterator itr=StudentName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
