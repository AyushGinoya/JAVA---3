
public class CalcThrowException {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);

        try
        {
        if(args[1].equals("+"))
        {
            System.out.println(a+b);
        }
        else if(args[1].equals("-"))
        {
            System.out.println(a-b);
        }
        else if(args[1].equals("$"))
        {
            System.out.println(a*b);
        }
        else if(args[1].equals("/"))
        {
            System.out.println(a/b);
        }
        }

        catch(Exception e)
        {
            System.out.println("h");
        }
    }
}
