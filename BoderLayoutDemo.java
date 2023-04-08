import java.awt.*;

class MyFrame1 extends Frame
{
    Button b1,b2,b3,b4,b5;
    Panel p;

    MyFrame1()
    {
        p=new Panel();
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");

        p.add(new Button("Selected"));
        p.add(new Button("Delete"));
        p.add(new Button("New"));

        GridLayout g = new GridLayout(3,1);
        p.setLayout(g);
        add(p, BorderLayout.WEST);
        add(b1,BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.CENTER);
        //add(b5);

    }
}

public class BoderLayoutDemo 
{
    public static void main(String[] args)
    {
        MyFrame1 f = new MyFrame1();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
