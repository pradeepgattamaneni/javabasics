import java.util.*;
 class employee
{
static Scanner s;
int id;
String name;
public void details()
{
s=new Scanner(System.in);
System.out.println("enter id and name");
id=s.nextInt();
name=s.next();
}
public void display()
{
System.out.println("employee id is "+id+" and name is "+name);
}


}


public class testemployee
{
public static void main(String [] ar)
{
int choice=0;
employee e=new employee();
do
{
System.out.println("------menu-------");
System.out.println("1.to enter details");
System.out.println("2.to display details");
System.out.println("3.exit");
System.out.println("enter the choice");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
switch(choice)
{
case 1:e.details();
       break;
case 2:e.display();
       break;
case 3:return;
default:System.out.println("invalid entry");

}

} while(choice >=1 && choice <=4);

}

}