import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class Exp_81 extends Frame implements ActionListener
{
    MenuBar mb;
    Menu m;
    MenuItem m1,m2,m3,m4;
    int t=0;
    Exp_81()
    {    
        mb = new MenuBar();
        m = new Menu("Light");
        m1 = new MenuItem("Red");
        m2 = new MenuItem("Yellow");
        m3 = new MenuItem("Green");
        m4 = new MenuItem("Reset");
        setMenuBar(mb);
        mb.add(m);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);

        addWindowListener(new MyWindow());
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
    }
    
    public void paint(Graphics g)
    {
        g.drawOval(100, 100, 80, 80);
        g.drawOval(100, 225, 80, 80);
        g.drawOval(100, 350, 80,80);

        if(t==1)
        {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 80, 80);
        }

        if(t==2)
        {
            g.setColor(Color.YELLOW);
            g.fillOval(100, 225, 80, 80);
        }

        if(t==3)
        {
            g.setColor(Color.green);
            g.fillOval(100, 350, 80,80);
        }

        if(t==4)
        {
            g.drawOval(100, 100, 80, 80);
            g.drawOval(100, 225, 80, 80);
            g.drawOval(100, 350, 80,80);            
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == m1)
        {
            t=1;
            repaint();
        }

        if(e.getSource() == m2)
        {
            t=2;
            repaint();
        }

        if(e.getSource() == m3)
        {
            t=3;
            repaint();
        }

        if(e.getSource() == m4)
        {
            t=4;
            repaint();
        }
    }

    class MyWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }

}
public class Exp_8_p1 
{
    public static void main(String[] args)
    {
        Exp_81 f = new Exp_81();
        f.setSize(500,500);
        f.setVisible(true);
    } 
}
