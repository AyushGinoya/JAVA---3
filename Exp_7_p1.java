import java.awt.*;
import java.awt.event.*;

class Viral extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Viral()
    {
        l1 = new Label("    Num 1   ");
        l2 = new Label("    Num 2   ");
        l3 = new Label("    Result     ");

        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        addWindowListener(new MyWindow());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource() == b1)
        {
            t3.setText(Integer.toString(a+b));
        }
        if(e.getSource() == b2)
        {
            t3.setText(Integer.toString(a-b));
        }
        if(e.getSource() == b3)
        {
            t3.setText(Integer.toString(a*b));
        }
        if(e.getSource() == b4)
        {
            t3.setText(Integer.toString(a/b));
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
public class Exp_7_p1 
{
    public static void main(String args[])
    {
        Viral v = new Viral();
        v.setSize(400,400);
        v.setVisible(true);
    }
}
