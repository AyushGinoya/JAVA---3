import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    Label l;
    Button b;
    int cnt=0;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;


    public MyFrame()
    {
       l = new Label(" ");
       c1 = new Checkbox("Java",cbg,false);
       c2 = new Checkbox("C++",cbg,false);
       c3 = new Checkbox("Dart",cbg,false);

       setLayout(new FlowLayout());
       add(l);
       add(c1);
       add(c2);
       add(c3);
    }

    public void itemStateChanged(ItemEvent e)
    {
        String str=" ";
        if(c1.getState())
            str=str+" "+c1.getLabel();
        if(c2.getState())
            str=str+" "+c2.getLabel();
        if(c3.getState())
            str=str+" "+c3.getLabel();
        if(!c1.getState() && !c1.getState() && !c1.getState())
            str = str + "Nothing is selected";
    }
}

public class Test
{
    public static void main(String args[])
    {
        MyFrame m = new MyFrame();
        m.setSize(400,400);
        m.setVisible(true);
    }
   
}