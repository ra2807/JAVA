class A
{
public int display(int d ,int e)
{
return d+e;
}
}
class B extends A
{
int show(int d,int e,int f)
{
return d+e+f;
}
public static void main(String[]main)
{
B obj=new B();
System.out.println(obj.display(1,1));
System.out.println(obj.show(1,1,1));
}
}



