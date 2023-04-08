class Rect
{
    private int length;
    private int breth;

    Rect()
    {
        System.out.println("Perent class constructer");
    }

    Rect(int x)
    {
        System.out.println("X=" + x);
    }

    Rect(int l,int b)
    {
        length=l;
        breth=b;
    }

    public int area()
    {
        return length*breth;
    }

    public int perameter()
    {
        return length+breth;
    }
}

class Cube extends Rect
{
    private int hight;

    Cube()
    {
        System.out.println("Child class constructer");
    }

    Cube(int x)
    {
        //super(x);
        System.out.println("X=" + x);
    }

    Cube(int l,int b,int h)
    {
        super(l,b);
        hight=h;
    }
    int area1=0;
    public void cubeVolume()
    {
        area1=area()*hight;
    }

    public void display()
    {
        System.out.println(area1);
    }


}
public class PerametrisedConstructor 
{
    public static void main(String[] args)
    {
        Cube c = new Cube(1,2,3);
        //Cube c1 = new Cube();
        //Cube c2 = new Cube(5);
        c.cubeVolume();     
        // method called upon object not upon reference
        c.display();
    }    
}
