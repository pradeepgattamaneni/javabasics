
public class engineer extends Employee
{
String desig;
    engineer(int id,String name,String ssid,double salary,String desig)
    {
        super(id,name,ssid,salary);
        this.desig=desig;        
    }
void display2()
{
System.out.println("engineer details are "+id+"  "+name+"  "+ssid+"  "+desig);
}
}