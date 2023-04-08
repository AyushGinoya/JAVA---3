abstract class supper
{
    public supper ()
    {
        System.out.println("constructr called");
    }
    public void method1()
    {
        System.out.println("supper m1");
    }
    abstract void method2();
   
}
class sub extends supper
{
    public void method2()
    {
        System.out.println("sub m2");
    }
}

class AbstractClass
{
    public static void main(String[] args)
    {
        supper s=new sub();
        s.method1();
        s.method2();
    } 
}