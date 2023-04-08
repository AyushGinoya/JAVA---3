public class TwoDArray {
    public static void main(String[] args)
    {
        int[][] matrix =new int [3][3];
        int n=3;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
