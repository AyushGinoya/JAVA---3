import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
import java.awt.Graphics;

class MovingBall extends Frame implements Runnable
{
   
    int x=50,y=50,a=250,b=250,m=450,n=50;
    int xx=1,yy=1,ax=-1,by=-1,mx=-1,ny=1;

    MovingBall()
    {
        

        Thread t = new Thread(this);
        t.start();
    }

    public void run()
    {
        while(true)
        {
            x=xx+x;
            y=yy+y;

            m=m+mx;
            n=ny+n;

            a=a+ax;
            b=b+by;

            if(x<0 || x>450)
            {
                xx = xx*-1;
            }

            if(y<20 || y>350)
            {
                yy = yy*-1;
            }

            if(a<2 || a>440)
            {
                ax = ax*-1;
            }

            if(b<20 || b>350)
            {
                by = by*-1;
            }

            if(m<0 || m>450)
            {
                mx = mx*-1;
            }

            if(n<20 || n>350)
            {
                ny = ny*-1;
            }

            try 
            {
                Thread.sleep(4);    
            } 
            catch (Exception e) 
            {
                
            }

            repaint();
        }
    }

    public void paint(Graphics g)
    {
        //g.setB(Color.green);
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);

        g.setColor(Color.red);
        g.fillOval(a,b,50,50);

        g.setColor(Color.red);
        g.fillOval(m,n,50,50);
    }
}

public class BallAnnimation
{
    public static void main(String[] args) 
    {
        MovingBall f = new MovingBall();
        f.setSize(500, 400);
        f.setVisible(true);
    }
}
