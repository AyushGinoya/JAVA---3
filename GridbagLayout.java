import java.awt.*;
import java.awt.event.*;

class ApnaClass extends Frame implements ActionListener
{
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,o1,o2,o3,o4,o5;
        TextField tf ;
        int n;
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        String s4,s5;
    ApnaClass()
    {
        setTitle("GridBag Layout");
        {
            

            b1 = new Button("1");
            b2 = new Button("2");
            b3 = new Button("3");
            b4 = new Button("4");
            b5 = new Button("5");
            b6 = new Button("6");
            b7 = new Button("7");
            b8 = new Button("8");
            b9 = new Button("9");
            b0 = new Button("0");
            o1 = new Button("+");
            o2 = new Button("-");
            o3 = new Button("*");
            o4 = new Button("/");
            o5 = new Button("=");
            tf = new TextField(" ",15);
        
           
            setLayout(gb);

            add(tf);

            gbc.gridx=1;
            gbc.gridy=1;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b1,gbc);
        
            gbc.gridx=2;
            gbc.gridy=1;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b2,gbc);

            gbc.gridx=3;
            gbc.gridy=1;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b3,gbc);

            gbc.gridx=1;
            gbc.gridy=2;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b4,gbc);

            gbc.gridx=2;
            gbc.gridy=2;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b5,gbc);

            gbc.gridx=3;
            gbc.gridy=2;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b6,gbc);

            gbc.gridx=1;
            gbc.gridy=3;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b7,gbc);

            gbc.gridx=2;
            gbc.gridy=3;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b8,gbc);

            gbc.gridx=3;
            gbc.gridy=3;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b9,gbc);

            gbc.gridx=1;
            gbc.gridy=4;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(b0,gbc);

            gbc.gridx=4;
            gbc.gridy=1;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(o1,gbc);

            gbc.gridx=4;
            gbc.gridy=2;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(o2,gbc);

            gbc.gridx=4;
            gbc.gridy=3;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(o3,gbc);

            gbc.gridx=4;
            gbc.gridy=4;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(o4,gbc);

            gbc.gridx=2;
            gbc.gridy=4;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 0;
            gbc.weighty = 0;
            add(o5,gbc);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            o1.addActionListener(this);
            o2.addActionListener(this);
            o3.addActionListener(this);
            o4.addActionListener(this);
            o5.addActionListener(this);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b0)
        {
            String s1 = tf.getText();
            String s2 = "0";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b1)
        {
            String s1 = tf.getText();
            String s2 = "1";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b2)
        {
            String s1 = tf.getText();
            String s2 = "2";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b3)
        {
            String s1 = tf.getText();
            String s2 = "3";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b4)
        {
            String s1 = tf.getText();
            String s2 = "4";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b5)
        {
            String s1 = tf.getText();
            String s2 = "5";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b6)
        {
            String s1 = tf.getText();
            String s2 = "6";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b7)
        {
            String s1 = tf.getText();
            String s2 = "7";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b8)
        {
            String s1 = tf.getText();
            String s2 = "8";
            tf.setText(s1+s2);
        }

        if(e.getSource()==b9)
        {
            String s1 = tf.getText();
            String s2 = "9";
            tf.setText(s1+s2);
        }

        if(e.getSource()==o1)
        {
            n=1;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==o1)
        {
            n=2;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==o1)
        {
            n=3;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==o1)
        {
            n=4;
            s4 = tf.getText();
            tf.setText("");
        }
        
        if(e.getSource() == o5)
        {
            s5 = tf.getText();

            if(n==1)
            {
                Double a = Double.parseDouble(s4) + Double.parseDouble(s5);
                tf.setText(Double.toString(a));
            }

            if (n==2)
            {
                Double a = Double.parseDouble(s4) - Double.parseDouble(s5);
                tf.setText(Double.toString(a));
            }
            if (n==3)
            {
                Double a = Double.parseDouble(s4) * Double.parseDouble(s5);
                tf.setText(Double.toString(a));
            }
            if (n==4)
            {
                Double a = Double.parseDouble(s4) / Double.parseDouble(s5);
                tf.setText(Double.toString(a));
            }
        }
    }
}
public class GridbagLayout 
{
    public static void main(String[] args)
    {
        ApnaClass f = new ApnaClass();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
