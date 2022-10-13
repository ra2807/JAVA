class ITE
{
String Employername;
long cellno;
int Idno;`  
String Employernative;
public ITE(String EN,long CN,int ID,String nativep)
{
System.out.println("Employer name is="+EN+"\ncellno="+CN+"\nIdno="+ID+"\nEmployernative="+nativep+"\n");
Employername =EN;
cellno =CN;
Idno =ID;
Employernative =nativep;
}
public static void main(String[]args)
{
ITE Employer1=new ITE("RAJA", 8754096358L,111,"SALEM");
ITE Employer2=new ITE("RAM", 7657899786L,112,"ATTUR");
ITE Employer3=new ITE("KUMAR", 8754096398L,113,"VEERAGANUR");
}
}  
