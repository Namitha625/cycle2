//program to search a particular element in a string
import java.util.*;
class search
{
    public static void main(String args[])
    {
        int m=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=obj.nextLine();
        System.out.println("Enter the character to be checked:");
        char a=obj.next().charAt(0);
        int len=name.length();
        for(int i=0;i<len;i++)
        {
            if(a==name.charAt(i))
            {
                System.out.println("It is present at position "+(i+1));
                m++;
            }
        }
        if(m==len)
        {
            System.out.println("It is not present");
        }

    }
}
