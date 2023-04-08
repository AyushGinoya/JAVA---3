import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import java.awt.Graphics;


class Demo2 extends Frame implements KeyListener
{
    int x = 100;
    int y = 100;
    char c = 'A';

    Demo2()
    {
        addKeyListener(this);
    }

    public void keyReleased(KeyEvent ke)
    {

    }

    public void keyPressed(KeyEvent ke)
    {
        if(ke.getKeyCode() == 65)
        {
            y = y + 10;
        }
        repaint();
    }

    public void keyTyped(KeyEvent ke)
    {

    }

    public void paint(Graphics g)
    {
        g.drawString("A",x,y);
    }

}
public class KeyEventDemo2
{
    public static void main(String[] args) 
    {
        Demo2 f = new Demo2();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
