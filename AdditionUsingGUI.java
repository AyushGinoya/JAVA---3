import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    Label l1;
    Label l2;
    Label l3;
    Button b;
    TextField t1,t2,t3;

    MyFrame() {

       setTitle("Addition");
       TextField t1 = new TextField("          ");
       t1.setBounds(100,100,20,20);
       TextField t2 = new TextField("          ");
       t2.setBounds(100,200,20,20);
       TextField t3 = new TextField("           ");
       t3.setBounds(100,300,20,20);

       l1 = new Label("Number1");
       l2 = new Label("Number2");
       l3 = new Label("Answer");

       b = new Button("Add");
       b.addActionListener(this);
        
        setLayout(new FlowLayout());

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);
        add(b);

    }

    public void actionPerformed(ActionEvent a) 
    {
        // int x = Integer.parseInt(t1.getText());
        // int y = Integer.parseInt(t2.getText()); 
        // int c = x + y;
        // t3.setText(String.valueOf(c));
        String s1="";
        s1=t1.getText();
        String s2=t2.getText();
        String s3=s2 + s1;
        t3.setText(s3);


    }
}

public class AdditionUsingGUI {
    public static void main(String args[]) {
        MyFrame f = new MyFrame();
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
