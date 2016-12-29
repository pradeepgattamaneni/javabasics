import java.util.*;
class multip
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number of lines of table 5");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
int m=5*i;
System.out.println("5*"+i+"="+m);
}

}
}