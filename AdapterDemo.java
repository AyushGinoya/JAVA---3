import java.awt.*;
import java.awt.event.*;

class Demo3 extends Frame
{
    Demo3()
    {
        addWindowListener(new WindowAdapterDemo());
    }

    class WindowAdapterDemo extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}

public class AdapterDemo 
{
    public static void main(String[] args) 
    {
        Demo3 f = new Demo3();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
