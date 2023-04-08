class SomthingErrorInInput extends Exception
{
    public String toString() {
        return "Dimensions can not be -Ve.";
    }
}

public class ThrowThrowsException {
    /* 
// you can define try and catch block any method.
    static void math2()
    {
        try{
        int x=math3();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static int math3()
    {
        return 10/0;
    }

    static void math1()
    {
        math2();
    }

    public static void main(String args[])
    {
        math1();
    }

    */

    static int area(int l, int b) throws SomthingErrorInInput
    {
        if(l<0 || b<0)
        {
            throw new SomthingErrorInInput();
        }
        return l*b;
    }
    static void math1()  throws SomthingErrorInInput
    {
        System.out.println(area(-10,2));
    }
    public static void main(String [] args)  

    {
        try
        {
            math1();
        }
        catch(SomthingErrorInInput e)
        {
            System.out.println(e);
        }
        
    }
}
