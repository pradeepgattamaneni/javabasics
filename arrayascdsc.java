import java.util.*;
class arrayascdsc{
public static void main(String[] args)
{
int t,n;

Scanner s = new Scanner(System.in);
System.out.println("enter length of array");
n=s.nextInt();
int[] a= new int[n];
System.out.println("enter numbers to array");
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(int j=1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("ascending order");
for(int i=0;i<n;i++)
{

System.out.println(a[i]);
}
System.out.println("descending order");
for(int i=n-1;i>=0;--i)
{

System.out.println(a[i]);
}

}
}