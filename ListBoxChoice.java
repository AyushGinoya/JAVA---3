import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    List l;
    Choice c;
    TextArea ta;
    Button b;

    MyFrame()
    {
       l = new List(7,true);
       c = new Choice();
       ta = new TextArea(10,20);
       b = new Button("Click");
       
       l.addItemListener(null);
       c.addItemListener(null);

       l.add("Ayush");
       l.add("Raj");
       l.add("Deep");
       l.add("Sahil");
       l.add("Vansh");
       l.add("Yaksh");

       c.add("Shruti");
       c.add("Drashti");
       c.add("Krisha");
       c.add("Neha");
       c.add("Ishita");
       c.add("Viral");
      // FlowLayout f = 
       setLayout(new FlowLayout());
       add(l);
       add(c);
       add(ta);
       add(b);
       
    }

    public void ItemStateChanged(ItemEvent ie)
    {
        if(ie.getSource() == l)
        {
            ta.setText(l.getItem(2));
        }
    }
}

public class ListBoxChoice 
{
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
