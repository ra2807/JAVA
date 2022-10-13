class Luxe
{
String moviename;
double time;
boolean hit;
public Luxe(String mn,double t,boolean h)
{
System.out.println(mn+ t+" "+h);
moviename=mn;
time=t;
hit=h;
}
public static void main(String[]args)
{

Luxe s1=new Luxe("ps1  ",10,true);
Luxe s2=new Luxe("nv  ",10.30,false);
System.out.println(s1.moviename);

}
}
