//checking wheather a string is pallindrome or not
import java.util.*;
class pallin
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=obj.nextLine();
        String rev="";
        int len=name.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed string is:"+rev);
        if(name.equals(rev)){
            System.out.println("It is pallindrome");}
        else
            {System.out.println("It is not pallindrome"); }
    }
}