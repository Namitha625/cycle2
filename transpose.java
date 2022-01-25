//finding transpose of a matrix
import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        int i,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the order matrix:");
        int m=obj.nextInt();
        int n=obj.nextInt();
        int [][]a=new int[m][n];
        System.out.println("Enter elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        int t[][]=new int[50][50];  
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                t[i][j]=a[j][i];
            }
        }
        System.out.println("Transposed matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(t[i][j]+"\t");
            }
        }
    }

}