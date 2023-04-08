import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    Label l;
    Button b;
    int count=0; 

    public MyFrame()
    {
        //super("Lable and Button");
        l=new Label("    " + count);
        b=new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    public void actionPerformed(ActionEvent a)
    {
        count++;
        l.setText("    " + count);
    } 

}
public class ButtonLable
{
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
   
}
