import java.util.*;
public class ExceptionHandalingDemo {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Ent vslue of a and b:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c;

            try 
            {
                c=a/b;
                System.out.println(c);
            } 
            
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
    }
}
