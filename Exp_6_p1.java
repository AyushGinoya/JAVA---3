import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class MyFrame12 extends Frame implements MouseListener
{
    Label l;
    int x=0;
    int y=0;

    MyFrame12()
    {
        setTitle("Mouse Pressed event");
        l=new Label("");
        addMouseListener(this);
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
        String str="(" + x + " , " + y+ ")";
        g.drawString(str,100,100);
    }

    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}

}

public class Exp_6_p1 
{
    public static void main(String[] args)
    {
        MyFrame12 f = new MyFrame12();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
