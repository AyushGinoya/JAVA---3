
class MyData
{
    int value = 0;
    boolean b = true;

    public void get(int v)
    {
        while(b != true)
        try
        {
            wait();
        }
        catch(Exception e)
        {

        }
        value = v;
        b=false;
        notify();
    }

    public int set()
    {
        int x=0;
        while(b != false)
        try
        {
            wait();
        }
        catch(Exception e)
        {
            
        }
        x=value;
        b=true;
        notify();
        return x;
    }
}

class Producer extends Thread
{
    MyData d;
    Producer (MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        int count = 0;
        while(true)
        {
            d.get(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}


class Consumer extends Thread
{
    MyData d;
    Consumer(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        while(true)
        {
            int value = d.set();
            System.out.println("Consumer " + value);
        }

    }
}
public class InnerThreadComm 
{
   public static void main(String args[])
   {
    MyData d = new MyData();

    Consumer c = new Consumer(d);
    Producer p = new Producer(d);

    p.start();
    c.start();
   }
}
