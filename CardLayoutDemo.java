import java.awt.*;
//import java.awt.event.*;

class Card1 extends Frame 
{
    Button b1,b2,b3,b4;
    Button bb1,bb2,bb3,bb4,bb5;
    Panel p1,p2,p3,p4,p5,mp;

    int count=0;
    

    CardLayout crd = new CardLayout(30,40);
    Container c;

    Card1()
    {
        c = new Container();
        p1= new Panel();
        p2= new Panel();
        p3= new Panel();
        p4= new Panel();
        p5= new Panel();
        mp = new Panel();

        bb1 = new Button("B1");
        bb2 = new Button("B2");
        bb3 = new Button("B3");
        bb4 = new Button("B4");

        p1.add(bb1);
        p2.add(bb2);
        p3.add(bb3);
        p4.add(bb4);

        b1=new Button("First");
        b2=new Button("  -->  ");
        b3=new Button("  <--  ");
        b4=new Button("Second");
        mp.setLayout(crd);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

        p5.add(b1,crd);
        p5.add(b2,crd);
        p5.add(b3,crd);
        p5.add(b4,crd);

       //BorderLayout b = new BorderLayout();
        // mp.add("1",p1);
        // mp.add("2",p2);
        // add(p1,b.NORTH);
        // add(p2,b.NORTH);
        // add(p3,b.NORTH);
        // add(p4,b.NORTH);
        // add(p5,b.SOUTH);

        // b1.addActionListener(this);
        // b2.addActionListener(this);
        // b3.addActionListener(this);
        // b4.addActionListener(this);
    }

    // public void ItemStateChanged(ItemEvent sc)
    // {
    //      if(sc.getState())
    //      {
    //          count=1;
    //          crd.first(c);

    //      }
    //      else if(crd.getState())
    //      {
    //          count++;
    //          crd.next(c);

    //      }
    //      else if(crd.getState())
    //      {
    //          count--;
    //          crd.previous(c);
    //      }
    //      else if(crd.getState())
    //      {
    //          count=4;
    //          card.last(c);
    //      }
    //  }

    // public void actionPerformed(ActionEvent a)
    // {
    //     if(a.getSource() == b1)
    //     {
    //         count = 1;
            
    //     }
    //     else if(a.getSource() == b2)
    //     {
    //         count++;
    //         crd.next(c);
    //     }
    //     else if(a.getSource() == b3)
    //     {
    //         count--;
    //         crd.previous(c);
    //     }
    //     else
    //     {
    //         count=4;
    //         crd.last(c);
    //     }
    //}

}

public class CardLayoutDemo {
    public static void main(String[] args) {
        Card1 f = new Card1();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
