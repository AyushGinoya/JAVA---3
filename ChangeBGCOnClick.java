import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements ActionListener
{
    Label l;
    Button b;
    int count=0;

    MyFrame()
    {
       // l = new Label("  "  + count);
        b = new Button("Submit");

        setLayout(new FlowLayout());
        //add(l);
        add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent a)
    {
        count++;
        if(count == 1)
        {
            setBackground(Color.green);
        }
    }
}
public class ChangeBGCOnClick {
    public static void main(String srgs[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
