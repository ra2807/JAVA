class Method
{
    void display(int a)
    {
        System.out.println("arguments "   + a);
    }
    void display(int a, int b)
    {
        System.out.println("arguments "    +a +  "and" +b);
    }
    public static void main(String[]args)
    {
        Method obj=new Method();
   obj.display(1);
   obj.display(1,2);
}
}
