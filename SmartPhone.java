class Phone
{
    public void call()
    {
        System.out.println("Phone call");
    }
    public void sms()
    {
        System.out.println("Phone SMS");
    }
}

interface ICamera
{
     void click(); 
     void recoding();
} 

interface IMusicPlayer
{
     void start();
     void stop();
     void playagain();
}

class SmartPhone1 extends Phone implements ICamera,IMusicPlayer
{
    public void click()
    {
        System.out.println("SmartPhone click Photo");
    }
    public void recoding()
    {
        System.out.println("SmartPhone start Video recoding");
    }
    public void start()
    {
        System.out.println("SmartPhone start music");
    }
    public void stop()
    {
        System.out.println("SmartPhone stop music");
    }
    public void playagain()
    {
        System.out.println("SmartPhone start playagain");
    }
    public void videocall()
    {
        System.out.println("SmartPhone start Videocall");
    }
}



public class SmartPhone {
    public static void main(String[] args)
    {
        SmartPhone1 sp=new SmartPhone1();
        sp.videocall();
        sp.click();
        sp.stop();
        sp.start();
        sp.playagain();
        sp.sms();
        sp.call();
        sp.recoding();

        System.out.println();
        System.out.println();
        System.out.println();

        Phone p=new Phone();
        p.call();
        p.sms();

        System.out.println();
        System.out.println();
        System.out.println();

        ICamera c=new SmartPhone1();
        c.click();
        c.recoding();
        
    }
}
