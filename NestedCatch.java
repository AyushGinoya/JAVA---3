//import java.util.Scanner;
public class NestedCatch {
    public static void main(String args[])
    {
        //Scanner sc= new Scanner ( System.in );
        int [] a={11,0,33,44,55,66,77,88,99};

        int c;
        try
        {
            c=a[2]/a[5];
            System.out.println(c);

            try
            {
                System.out.println(a[12]);
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("Ok,Bye");
    }
}
