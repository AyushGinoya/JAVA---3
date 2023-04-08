class MyData
{
    synchronized public void display(String str)
    {
        for(int i=0;i<str.length();++i)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

class Thread1 extends Thread
{
    MyData d;
   public Thread1(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Hello Ayush");
    }
}

class Thread2 extends Thread
{
    MyData d;
    public Thread2(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Ayush's Best Friend is.....");
    } 
}


public class Sinchronize 
{
    public static void main(String[] args)
    {
        MyData data = new MyData();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        t1.start();
        t2.start();
    }
}
