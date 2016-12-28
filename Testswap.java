class swap
{
int a=10,b=15;
void swap1()
{
int t;
t=a;
a=b;
b=t;
System.out.println("values after swap using third variable a="+a+" b="+b);
}
void swap2()
{
a=a+b;
b=a-b;
a=a-b;
System.out.println("values after swap without using third variable a="+a+" b="+b);
}

}
class Testswap
{
public static void main(String args[])
{
swap s=new swap();
s.swap1();
s.swap2();
}
}