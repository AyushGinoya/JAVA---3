public class Print_4digitNum 
{
    public static void main(String args[])
    {
        //int n=4;
        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                for(int c=1;c<=4;c++)
                {
                    for(int d=1;d<=4;d++)
                    {
                        if(a<b && d<c && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
                        {
                            System.out.println(1000*a + 100*b + 10*c + d);
                        }
                    }
                }
            }
        }
    }   
}
