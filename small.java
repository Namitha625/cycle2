//finding the smallest element in an array
import java.util.*;
class small
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of array");
        int size =obj.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the Elements of array");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        int min=a[0];
        for(i=1;i<size;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Smallest Element of array:"+min);
    }
}