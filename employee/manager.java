public class manager extends Employee
{
String dept;
    manager(int id,String name,String ssid,double salary,String dept)
    {
        super(id,name,ssid,salary);
        this.dept=dept;        
    }
void display1()
{
System.out.println("manager details are "+id+"  "+name+"  " +ssid+"  "+dept);
}
}