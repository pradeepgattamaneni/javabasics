class student

{

String[5] name;
int[5] age;

int elder;
Scanner s=new Scanner();

    public void accept()
   
 {
   for(int i=0;i<5;i++)
{
this.name[i]=s.next();
this.age[i]=s.nextInt();
if(elder<age[i])
{
elder=age[i];
}

}
for(int i=0;i<5;i++)
{
if(age[i]==elder)
{
System.out.println(name[i]+" is the eldest" );
}

}

}


}