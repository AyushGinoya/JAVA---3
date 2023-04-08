import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener , ActionListener
{
    Label l1,l2;
    Button b;
    TextArea ta;
    TextField t;

    MyFrame()
    {
        l1 = new Label("Enter Text");
        l2 = new Label("No Text");
        t = new TextField(40);
        t.setEchoChar('*');
        b = new Button("click");
        ta = new TextArea(10,20);
        

        setLayout(new FlowLayout());
        add(l1);
        add(t);
        
        add(b);
       // setLayout(new GridLayout());
        add(ta);
        add(l2);

        t.addTextListener(this);
        b.addActionListener(this);
    }

        public void textValueChanged(TextEvent t)
        {
            l1.setText(ta.getText());
        }

        public void actionPerformed(ActionEvent e)
        {
           // l2.setText(t.getText());          //textField 
           // l2.setText(ta.getSelectedText());           //TextArea
           //ta.append(t.getText());              //TextArea
           //ta.insert(t.getText() , ta.getCaretPosition());
        }
}

public class TextFiledArea 
{
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(600,600);
        f.setVisible(true);
    }    
}
