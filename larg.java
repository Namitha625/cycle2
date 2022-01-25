//Program to find the largest element in an NXN matrix.
import java.util.*;
class larg
{
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            int i;
            System.out.println("Enter the no.of rows of array");
            int r=obj.nextInt();
            System.out.println("Enter the no.of columns of array");
            int  c=obj.nextInt();
            int a[][]=new int[r][c];
            System.out.println("Enter the Elements of array");
            for(i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j]=obj.nextInt();
                }
            }
            int max=a[0][0];
            for(i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(a[i][j]>max)
                    {
                        max=a[i][j];
                    }
                }
            }
            System.out.println("Largest number is:"+max);
        }
    }
}