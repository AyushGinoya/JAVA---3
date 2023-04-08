import java.awt.*;

class MyFrame1 extends Frame
{
    Button b1,b2,b3,b4,b5;

    MyFrame1()
    {
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");

        FlowLayout f = new FlowLayout();
        setLayout(f);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }
}

public class FlowLayoutDemo 
{
    public static void main(String[] args)
    {
        MyFrame1 f = new MyFrame1();
        f.setSize(400,400);
        f.setVisible(true);
    }    
}
