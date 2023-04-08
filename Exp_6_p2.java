import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class MyFrama12 extends Frame
{
    MyFrama12()
    {
        addWindowListener(new MyWindow());
    }

    class MyWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    public void paint(Graphics g)
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                String str = Integer.toString((i*j));
                g.drawString(str, i*30, 30+j*30);
            }
        }
    }
}
public class Exp_6_p2 
{
    public static void main(String[] args)
    {
        MyFrama12 f = new MyFrama12();
        f.setSize(400,400);
        f.setVisible(true);
        f.repaint();
    }   
}
