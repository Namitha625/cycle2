//replace a particular element in an array
import java.util.*;
class replace
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
            System.out.println("Enter the position to be changed:");
            int c=obj.nextInt();
            System.out.println("Enter the element at that position:");
            int x=obj.nextInt();
            a[c]=x;
            System.out.println("New array:");
            for(i=0;i<size;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
}
