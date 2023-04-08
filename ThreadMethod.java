class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(count>0)
        {
            System.out.println(count++);
            try
            {
                sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public MyThread(String name)
    {
        super(name);
        setPriority(9);
    }
}

public class ThreadMethod {
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread("1st Thread");
        t.start();
        // System.out.println("ID is : " + t.getId());
        // System.out.println("Name is : " + t.getName());
        // System.out.println("Priority is : " + t.getPriority());
        // System.out.println("State is : " + t.getState());
        // System.out.println("Alive is : " + t.isAlive());
        // System.out.println("Daemon is : " + t.isDaemon());
        System.out.println("Interrupted is : " + t.isInterrupted());
        t.interrupt();
    }
}
