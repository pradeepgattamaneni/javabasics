import java.util.*;
class Cylender
{
double v;
int r,h;
void values()
{
System.out.println("enter values or r and h");
Scanner s=new Scanner(System.in);
r=s.nextInt();
h=s.nextInt();
}
void display(){
v=3.14*r*r*h;
System.out.println("volume of cylender is"+v);
}
public static void main(String args[])
{
Cylender c=new Cylender();
c.values();
c.display();
}
}