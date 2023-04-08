class HondaCity
{
    static long p=1000;
    static int a;
    int b;

    public static double onRoadPrice(String City)
    {
        switch(City)
        {
            case "Rajkot":
                return p+p*0.1;
            case "Jamangar":
                return p+p*0.2;
        }
        return a;
    }
}

public class StaticExample {
    public static void main()
    {
        System.out.println(HondaCity.onRoadPrice("Rajkot"));
        System.out.println(HondaCity.p);
    }
}
