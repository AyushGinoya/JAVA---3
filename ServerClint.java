import java.io.*;
import java.net.*;

public class ServerClint 
{

    //-------------------------------------------------->For Server<-----------------------------------------------------------//
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(2000);
        Socket skt = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream()); 

        String msg;
        StringBuilder sb;
        do
        {
            msg = br.readLine();

            sb= new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);
        }
        while(!msg.equals("dne"));
        ss.close();
    }
}



class Clint 
{
    //-------------------------------------------------->For Clint<-----------------------------------------------------------//
    public static void main(String args[]) throws Exception
    {
        Socket skt = new Socket("192.168.192.200",2000);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream()); 

        String msg;
        do
        {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server " + msg );
        }
        while(!msg.equals("dne"));
        
        skt.close();
    }
}
