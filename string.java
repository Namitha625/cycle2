//program to replace a character in a string
import java.util.*; 
class string
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in); 
       
       System.out.println("Enter the string"); 
        String str=sc.next();
       
       System.out.println("Enter the charcater to be replaced"); 
        char ch=sc.next().charAt(0);

       System.out.println("Enter the replacement character"); 
        char ch1=sc.next().charAt(0);
      
       int size=str.length(); 

       for(int i=0;i<size;i++) 
        { 
            char che=str.charAt(i); 
            if(ch==che) 
             str=str.replace(str.charAt(i),ch1);
        }  
       System.out.println(str);
   } 
}