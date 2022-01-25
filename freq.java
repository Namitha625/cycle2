//to find the frequency of a character in a string
import java.util.*;
class freq
{
	public static void main(String args[])
	{   int freq=0;
    	Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        System.out.println("Enter the character to be checked");
        char a=obj.next().charAt(0);
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i)){
                System.out.println("The character is present at position "+(i+1));
                freq++ ;   } 
        }
        System.out.println("Frequency of character is "+freq) ; 
        
    }
}