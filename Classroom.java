class Classroom
{
public void room (String name,int rollno)
{
System.out.println("Name: "  +name   +" ,Rollno: "   +rollno);
}
public void room (int rollno,String name)
{
System.out.println("Rollno: "   +rollno +",Name: "  +name);
}
public static void main(String[]args)
{
Classroom obj =new Classroom();
obj.room("ram",5);
obj.room(6,"raja");
}
}
