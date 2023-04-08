import java.awt.Graphics;
import java.awt.*;
//import java.awt.color;

public class CircleDraw extends Frame
{
    CircleDraw()
    {
        setSize(600,600);
        setVisible(true);
       // setBackground(color.read);
    }
    
    public void paint(Graphics g)
    {
        g.drawOval(250,250,100,100);
        g.drawRect(250,250,100,100);
        g.drawLine(250,300,350,300);
        g.drawLine(300,250,300,350); 
    }
    
    public static void main(String[] args)
    {
        CircleDraw c=new CircleDraw();
        c.repaint();
    }

}
