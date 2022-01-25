//finding Second largest element in an array
import java.util.*;
class sec
{
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            int i;
            System.out.println("Enter the size of array");
            int size =obj.nextInt();
            int a[]=new int[size];
            System.out.println("Enter the Elements of array");
            for(i=0;i<size;i++)
            {
                a[i]=obj.nextInt();
            }
            for(i=0;i<size-1;i++)
            {
                for(int j=0;j<size-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                       int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;

                    }
                }
            }
            System.out.println("The second largest element is:"+(a[size-2]));
        }
    }
}