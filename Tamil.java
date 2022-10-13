class Tamil
{
String language;
public Tamil()
{

language="java";

}
public void getName() {
    System.out.println("Programming Langauage: " + language);
  }
public Tamil(String L)
{
System.out.println(" Programming Langauage: "+L);
language=L;
}

public static void main(String[]args)
{
Tamil T=new Tamil();
T.getName();
Tamil T1=new Tamil("python");

}
}

