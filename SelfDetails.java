

class SelfDetails
{
String name;
String status;
String qualification;
String phone;
int age;

void details()
{
name="pradeep";
status="unemployed";
qualification="graduate";
phone="9789997199";
age=22;
}

void display()
{
System.out.println("my details");
System.out.println(name+" "+age+" "+phone+" "+qualification+" "+status);
}

public static void main(String[] aa)
{
SelfDetails s=new SelfDetails();
s.details();
s.display();
}
}