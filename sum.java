//sum of elements in an array
import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,sum=0;
        System.out.println("Enter the size of array");
        int size =obj.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the Elements of array");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<size;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum="+sum);
    }
}