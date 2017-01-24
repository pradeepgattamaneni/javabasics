import java.util.*;

public class LinkedListEx {
//linkedList supports Doubly linked 
	public static void main(String[] args) {
	LinkedList EmpName= new LinkedList();
	
    EmpName.add("john");
	EmpName.add("tim");
	EmpName.add("kate");
	EmpName.add("ram");
	EmpName.add("jim");
	
	ListIterator itrl=EmpName.listIterator();
	
	while(itrl.hasNext())
	{
		System.out.println(itrl.next());
	}

	
	
	while(itrl.hasPrevious())
	{
		System.out.println(itrl.previous());
	}
		
		
	}

}
