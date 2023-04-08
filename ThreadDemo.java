class MyThread extends Thread                   //implements Runnable
{
    //@override
    public void run()
    {
        int i=1;
        while(i>0)
        {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class ThreadDemo
 {
       public static void main(String[] args)
       {
            MyThread my=new MyThread();                 // MyThread my=new MyThread(); 
                                                       // Thread t=new Thread(my);
                                                      // t.start();    
            //my.run();            
            my.start();
            int i=1;
            while(i>0)
            {
                System.out.println(i + ", Wellcome to Ayush's World");
                i++;
            }
       } 
}


/*If you want to creat only one class then you can also write ThreadDemo extands Thread and you must need to override the run function. */