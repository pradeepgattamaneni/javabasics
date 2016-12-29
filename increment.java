import java.util.*;
class increment
{
int x,y,z;
void values(){
Scanner s=new Scanner(System.in);
System.out.println("enter x,y,z");
x=s.nextInt();
y=s.nextInt();
z=s.nextInt();
}
void postincriment(){
y=x++;
z=y++;
x++;
y++;
System.out.println("values after post increment  "+x+"  "+y+"  "+z);
}
void preincriment(){
y=++x;
z=++y;
++x;
++y;
System.out.println("values after pre increment  "+x+"  "+y+"  "+z);
}
public static void main(String args[])
{
increment i=new increment();
i.values();
i.postincriment();
i.preincriment();
}
}

