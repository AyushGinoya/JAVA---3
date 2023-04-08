import java.io.*;

public class CharDemo 
{
    public static void main(String[] args) throws Exception
    {
        char[] b = {'a','y','u','s','h','<','<','<','3','a','a','y','u','s','h','i'};


        CharArrayReader cr = new CharArrayReader(b);

        int x;
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
        }
        cr.close();

    }    
}
