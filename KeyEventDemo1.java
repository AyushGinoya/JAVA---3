import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Demo1 extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    
    Demo1()
    {
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(30,30, 100, 20);
        l2.setBounds(30,60, 100, 20);
        l3.setBounds(30,90, 100, 20);
        l4.setBounds(30,120, 100, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

    }

    public void keyReleased(KeyEvent ke)
    {
        l1.setText("KeyRelesed");
        l2.setText("");
        l3.setText("");
        l4.setText("");
    }

    public void keyPressed(KeyEvent ke)
    {
        l2.setText("KeyPressed");
        l3.setText("");
        l4.setText("");
        l1.setText((""));
    }

    public void keyTyped(KeyEvent ke)
    {
        l3.setText("KeyTyped");
        l4.setText(new Date(ke.getWhen()) + "");
    }
}
public class KeyEventDemo1 
{
    public static void main(String[] args) {
        Demo1 f = new Demo1();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
