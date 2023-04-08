import java.io.*;

public class BufferedDemo 
{
    public static void main(String[] args) throws Exception
    {
        // FileInputStream fis = new FileInputStream("F:/Program/Java/test.txt");
        // BufferedInputStream bf = new BufferedInputStream(fis);

        FileReader fis = new FileReader("F:/Program/Java/test.txt");
        BufferedReader bf = new BufferedReader(fis);
        
        //System.out.println("File "+ fis.markSupported());
        //System.out.println("Buffer "+ bf.markSupported());

        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        bf.mark(10);
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        bf.reset();
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        System.out.println(" Remaining String" + bf.readLine());

        bf.close();
        
    }
}
