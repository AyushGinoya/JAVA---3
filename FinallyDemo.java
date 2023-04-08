public class FinallyDemo {

    static void math() throws Exception
        {
            try
            {
                System.out.println(10/0);
            } 
            finally             //if try is there then and the you can use finally
            {
                System.out.println("This Statement must be exicute so i'm writeen in finally block");
            }
        }
    public static void main(String[] args) throws Exception
    {
        math();
    }
}
