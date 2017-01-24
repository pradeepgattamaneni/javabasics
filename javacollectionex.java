import java.util.*;


public class javacollectionex {
	

	public static void main(String[] args) {
		ArrayList EmpName=new ArrayList();
		EmpName.add("john");
		EmpName.add("tim");
		EmpName.add("kate");
		EmpName.add("ram");
		EmpName.add("jim");
		
		System.out.println(EmpName);
		
		System.out.println("is ArrayList Empty"+EmpName.isEmpty());
		System.out.println("size of ArrayList"+EmpName.size());
		System.out.println("location of kate is  "+EmpName.indexOf("kate"));
		
		Iterator itr=EmpName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
class Employee
{
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
