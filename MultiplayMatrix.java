import java.util.*;

public class MultiplayMatrix 
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ent m and n");
        m=sc.nextInt();
        n=sc.nextInt();

        int[][] arr1=new int[n][m];
        int[][] arr2=new int[m][n];
        int[][] arr3=new int[m][n];

        System.out.println("Ent m and n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Ent m and n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=0;
                for(int k=0;k<n;k++)
                {
                    sum += arr1[i][k]*arr2[j][k];
                    arr3[i][j]=sum;
                }
            }
        }
        System.out.println("Ent m and n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }

            sc.close();
    }
    
}
