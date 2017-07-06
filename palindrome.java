import java.util.*;
class palindrome{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter string");
String str = s.next();
String rev = "";
for(int i= str.length()-1;i>=0;--i)
{
rev+=str.charAt(i);
}
if(rev.equalsIgnoreCase(str))
{
System.out.println("given string "+str+" is a palindrome");
}else
{
System.out.println("given string "+str+" is not a palindrome");
}
}

}