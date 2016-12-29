import java.util.*;
class temperature
{
public static void main(String args[])
{
double f,c;
System.out.println("enter temperature in celcious °c");
Scanner s=new Scanner(System.in);
c=s.nextInt();
f=c*(9/5)+32;
System.out.println("temperature in foriegnheit is"+f+"°f");
}
}