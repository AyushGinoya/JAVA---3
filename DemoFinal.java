class Test
{
    public final void math1()       //You cann't override this method in whole programm
    {
        System.out.println("Hell0");
    }
}

class Test1
{
        public void math1()       //You cann't creat child class of Test1 but you creat reference of test1 class and use it
    {
        System.out.println("Hell0");
    }
}


public class DemoFinal {
    final int AYUSH;  //when you declard as a data type in class then you must initilizition at that time
    {
        AYUSH=30; 
    }
      // If you initilize in class and try to access from static method then it give's error-Sol.-make final member as a static
                //You can initilize in block b'coz block { } directly exicuate
                // You can not initilize in static block b'coz static { } is inilize only static variable
    public static void main(String[] args)
    {
        //System.out.println(AYUSH);
    }
}
