
/**
 * Write a description of class caesar_cipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class caesar_cipher
{
   void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a a sentence of length greater than 3 and less than 100");
       String s=sc.nextLine();
       int len=s.length();
       if(len<3||len>100)
       System.out.println("INVALID LENGTH");
       else
       {
           for(int i=0;i<len;i++)
           {
               char ch=s.charAt(i);
               if((ch>='A'&&ch<='M')||(ch>='a'&&ch<='m'))
               ch+=13;
               else if((ch>='N'&&ch<='Z')||(ch>='n'&&ch<='z'))
               ch-=13;
               
               System.out.print((char)ch);
            }
        }
    }
}
