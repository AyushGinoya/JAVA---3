import java.io.*;
public class ByteDemo 
{
    public static void main(String[] args)
    {

        /* 

        byte[] b = {'a','y','u','s','h','<','<','<','3','a','a','y','u','s','h','i'};


        ByteArrayInputStream bais = new ByteArrayInputStream(b);

        // method 1

        int x;

        while((x=bais.read())!=-1)
        {
            System.out.println((char)x);
        }

        bais.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        

        //method 2

        String str = new String(bais.readAllBytes());
        System.out.println(str);
        try{
        bais.close();
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }

        */

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);//20=Size

        bos.write('a');
        bos.write('a');
        bos.write('r');
        bos.write('y');
        bos.write('a');
 
        byte[] b=bos.toByteArray();
        for(byte x:b)
        {
            System.out.println((char)x);
        }


        try{
        //bos.writeTo(new FileOutputStream("F:/Program/Java/test.txt"));
            bos.close();
        } 
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
    }    
}
