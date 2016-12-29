class distance
{
int u,a,t;
public void initialize()
{
u=3;
a=9;
t=2;
}
void display()
{
double distance=u*t+(0.5*a*t*t);
System.out.println("distance is"+distance);
}
public static void main(String ar[])
{
distance d=new distance();
d.initialize();
d.display();
}

}