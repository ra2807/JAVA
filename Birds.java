class Birds
{
String Birdname;
int Birdscount;
float Birdsize;
public Birds(String BN,int BC)
{
Birdname=BN;
Birdscount=BC;
System.out.println("Bird name is="+ BN+"\nBirds count="+BC);
}
public Birds(String BN,int BC,float BS)
{
Birdname=Birdname;
Birdscount=BC;
Birdsize=BS;
System.out.println("Bird name is="+ BN+"\nBirds count="+BC+"\nBirdsize="+BS);
}
public static void main(String[]args)
{
Birds peacock=new Birds("peacock",20);
Birds B2=new Birds("eagle",40,6.3f);
System.out.println("Bird name is="+peacock.Birdname);
System.out.println("Bird name is="+B2.Birdname);
System.out.println("Birds count="+peacock.Birdscount);
System.out.println("Birds count="+B2.Birdscount);
System.out.println("Birdsize="+peacock.Birdsize);
System.out.println("Birdsize="+B2.Birdsize);
}
}
//System.out.println("Bird name is="+ BN+"\nBirds count="+BC+"\nBirdsize="+BS);

