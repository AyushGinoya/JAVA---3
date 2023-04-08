import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3,c4;

    public MyFrame()
    {
        l = new Label(" ");
        c1 = new Checkbox("Ayush");
        c2 = new Checkbox("Deep");
        c3 = new Checkbox("Raj");
        c4 = new Checkbox("Sahil");
        try{
        c1.addItemListener((java.awt.event.ItemListener) this);
        c2.addItemListener((java.awt.event.ItemListener) this);
        c3.addItemListener((java.awt.event.ItemListener) this);
        c4.addItemListener((java.awt.event.ItemListener) this);
        }
        catch(Exception e)
        {
            
        }

        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);

    }

    public void itemStateChanged(ItemEvent e)
    {
        String s=" ";
        if(c1.getState())
        {
            s=s+" "+c1.getLabel();
        }

        if(c2.getState())
        {
            s=s+" "+c2.getLabel();
        }

        if(c2.getState())
        {
            s=s+" "+c1.getLabel();
        }

        if(c1.getState())
        {
            s=s+c1.getLabel();
        }
        if(s.isEmpty())
            s="Nothig is set";
            
        l.setText(s);
    }
}

public class CheakBox 
{
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }    
}
