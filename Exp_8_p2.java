import java.awt.*;
import java.awt.event.*;

class Name1 extends Frame implements ActionListener
{
    Button bnum[ ] = new Button[10];
    Button bop[ ] = new Button[5];
    String op[] = {"+","-","*","/","="};
    TextField tf = new TextField(20);
    int n;
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    String s1,s2,s3,s4,s5;

    Name1()
    {     
        setTitle("Calculator");
        setLayout(gb);
        
        for(int i=0;i<10;i++)
        {
            bnum[i]=new Button("" + i);
            bnum[i].addActionListener(this);
        }

        for(int i=0;i<5;i++)
        {
            bop[i] = new Button(op[i]+"");
            bop[i].addActionListener(this);
        }

        add(bnum[1],gbc,0,0,1,1,0,0);
        add(bnum[2],gbc,1,0,1,1,0,0);
        add(bnum[3],gbc,2,0,1,1,0,0);
        add(bop[0],gbc,3,0,1,1,0,0);

        add(bnum[4],gbc,0,1,1,1,0,0);
        add(bnum[5],gbc,1,1,1,1,0,0);
        add(bnum[6],gbc,2,1,1,1,0,0);
        add(bop[1],gbc,3,1,1,1,0,0);

        add(bnum[7],gbc,0,2,1,1,0,0);
        add(bnum[8],gbc,1,2,1,1,0,0);
        add(bnum[9],gbc,2,2,1,1,0,0);
        add(bop[2],gbc,3,2,1,1,0,0);

        add(bnum[0],gbc,0,3,1,1,0,0);
        add(bop[4],gbc,1,3,2,1,0,0);
        add(bop[3],gbc,3,3,1,1,0,0);    
        add(tf,gbc,0,6,5,1,0,0);
    }
    public void add(Component c,GridBagConstraints cs,int x,int y,int w,int h,int wx,int wy)
    {
            cs.gridx=x;
            cs.gridy=y;
            cs.gridwidth=w;
            cs.gridheight=h;
            cs.weightx=wx;
            cs.weighty=wy;

            gb.setConstraints(c,cs);
            add(c);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bnum[0])
        {
            String s1 = tf.getText();
            String s2 = "0";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[1])
        {
            String s1 = tf.getText();
            String s2 = "1";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[2])
        {
            String s1 = tf.getText();
            String s2 = "2";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[3])
        {
            String s1 = tf.getText();
            String s2 = "3";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[4])
        {
            String s1 = tf.getText();
            String s2 = "4";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[5])
        {
            String s1 = tf.getText();
            String s2 = "5";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[6])
        {
            String s1 = tf.getText();
            String s2 = "6";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[7])
        {
            String s1 = tf.getText();
            String s2 = "7";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[8])
        {
            String s1 = tf.getText();
            String s2 = "8";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bnum[9])
        {
            String s1 = tf.getText();
            String s2 = "9";
            tf.setText(s1+s2);
        }

        if(e.getSource()==bop[0])
        {
            n=1;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==bop[1])
        {
            n=2;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==bop[2])
        {
            n=3;
            s4 = tf.getText();
            tf.setText("");
        }

        if(e.getSource()==bop[3])
        {
            n=4;
            s4 = tf.getText();
            tf.setText("");
        }
        
        if(e.getSource() == bop[4])
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
public class Exp_8_p2 
{
    public static void main(String[] args)
    {
        Name1 f = new Name1();
        f.setSize(400,400);
        f.setVisible(true);
    } 
} 