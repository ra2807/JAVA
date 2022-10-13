class Base 
 { 
 public void M1() 
 { 
 System.out.println("BASE"); 
 } 
 }
class Derived extends Base 
{
public void M2() 
 { 
 System.out.println("Derived Class Methods"); 
 } 
public static void main(String[] args) 
 { 
 Derived d = new Derived(); // creating object 
 d.M1(); // print Base Class Method 
 d.M2(); // print Derived Class Method 
 } 
}
