import java.util.*;
public class InputMisMatchingExceptionDemo{
        public static void main(String[] args)
        {
            try (Scanner input = new Scanner(System.in)) {
                try
                {
                    System.out.print("Enter number : ");
                    int av=input.nextInt();
                    System.out.println("Number is : " + av);
                }
                catch(Exception e)      //If i'm writing (InputMismatchException ex) then it will give error why?
                {
                    System.out.println(e);
                }
            }
        }
}
