import java.util.*;
class largestofthree{
public static void main(String[] args)
{
int i,j,k;
Scanner s = new Scanner(System.in);
System.out.println("enter three numbers");

i = s.nextInt();
j = s.nextInt();
k = s.nextInt();

if(i>j&&i>k)
{
System.out.println(i+" is the greatest");
}else if(j>i&&j>k)
{
System.out.println(j+"is the greatest");
}else if(k>j&&k>i)
{
System.out.println(k+" is the greatest");
}else if(i==j&&i==k)
{
System.out.println("all are equal");
}else

System.out.println("any of two are highest and equal");
 }

}