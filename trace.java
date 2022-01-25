//finding trace of a matrix
import java.util.*;
class trace
{
    public static void main(String args[])
    {
        int i,j,trace=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the order matrix:");
        int m=obj.nextInt();
        int [][]a=new int[30][30];
        System.out.println("Enter elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            trace=trace+a[i][i];
        }
        System.out.println("Trace="+trace);
    }
}