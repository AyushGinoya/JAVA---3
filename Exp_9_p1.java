import java.awt.*;
import java.awt.event.*;

class Exp_9 extends Frame implements ActionListener
{
    TextField t1,t2;
    Label l;
    Button b;
    int[] arr = new int[100];

    Exp_9()
    {
        t1 = new TextField(20);
        t2 = new TextField(20);
        l = new Label("Ent num");
        b = new Button("Show");

        setLayout(null);
        l.setBounds(100,100,50,20);
        t1.setBounds(150, 100, 100, 20);
        t2.setBounds(150, 150, 100, 20);
        b.setBounds(200, 200, 50, 20);

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*5;
        }   
        add(l);
        add(t1);
        add(t2);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            try{
                int a=Integer.parseInt(t1.getText());
                t2.setText(Integer.toString(arr[a]));
            }
            catch (Exception ae)
            {
                t2.setText("Out of Bound");
            }
        }
    }
}
public class Exp_9_p1 
{
    public static void main(String[] args)
    {
        Exp_9 f = new Exp_9();
        f.setSize(500,500);
        f.setVisible(true);
    } 
}

