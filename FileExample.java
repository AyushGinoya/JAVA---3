import java.io.*;
/*
  do
  {
    run code and see what happen in test file
  }
  while(All comment line!=tested)

*/
public class FileExample 
{
    public static void main(String[] args)
    {
        
        /*
        try
        {
            FileOutputStream fos = new FileOutputStream("F:/Program/Java/test.txt");
            String str="Learning Java Programming";

            //fos.write(str.getBytes());

            byte[] b=str.getBytes();

            //fos.write(b,9,str.length()-9);

            fos.write(b);

            // for(byte x:b)
            // {
            //     fos.write(x);
            // }
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        { 
            System.out.println(e);
        }

        */

        try
        {
            FileInputStream fis = new FileInputStream("F:/Program/Java/test.txt");  
            //FileReader fr = new FileReader("F:/Program/Java/test.txt");  --> also use
            
            /*
            String str="Learning Java Programming";

            
            
            byte[] b = new byte[fis.available()];
            fis.read(b,6,str.length());

            String str1 = new String(b);
            System.out.println(str1);
            */

            int x;
            while ((x=fis.read())!=-1) 
            {
                System.out.println((char)x);     
            }
            fis.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }   
}
