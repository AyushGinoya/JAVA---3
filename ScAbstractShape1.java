//package ScAbstractShape1;

abstract class Shape
{
    abstract void area();
    abstract void perameter();
    abstract void display();
}

class ractangle extends Shape
{
    int w;
    int l;
    int a;
    int p;
    public void area()
    {
        a=l*w;
    }
    public void perameter()
    {
        p=2*(l+w);
    }
    public void display()
    {
        System.out.println("Area of ract is="+a);
        System.out.println("Pera of ract is="+p);
    }
}

class circle extends Shape
{
    int r;
    double a;
    double p;
    public void area()
    {
        a=3.14*r*r;
    }
    public void perameter()
    {
        p=2*r*3.14;
    }
    public void display()
    {
        System.out.println("Area of circle is="+a);
        System.out.println("Pera of circle is="+p);
    }
}
public class ScAbstractShape1 {
    public static void main(String[] args)
    {
        Shape r=new ractangle();
        r.area();;
        r.perameter();
        r.display();
        Shape c=new circle();
        c.area();
        c.perameter();
        c.display();
    }
}
