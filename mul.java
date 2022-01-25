//program to multiply two matrix
import java.util.*;
class mul
{
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            int i,j,k;
            System.out.println("Enter the order of first matrix");
            int r=obj.nextInt();
            int c=obj.nextInt();
            System.out.println("Enter the order of second matrix");
            int m=obj.nextInt();
            int n=obj.nextInt();
            int a[][]=new int[r][c];
            int b[][]=new int[m][n];
            int [][]s=new int[50][50];
            if(c==m)
                {
                System.out.println("Enter the Elements of Matrix1:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        a[i][j]=obj.nextInt();
                    }
                }
                System.out.println("Enter the Elements of MAtrix2:");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        b[i][j]=obj.nextInt();
                    }
                }
                for(i=0;i<r;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        s[i][j]=0;
                        for(k=0;k<c;k++)
                        {
                            s[i][j]+=a[i][k]*b[k][j];
                        }
                        
                    }
                }
                System.out.println("The multiplied matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.println(s[i][j]+"\t");
                    }
                    System.out.println("\n");
                }
                }
                else{
                    System.out.println("multiplication is not possible");
                }
        }
    }
    
}