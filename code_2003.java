
/**
 * Write a description of class code_2003 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class code_2003
{
   void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter encrypted code");
       String str=sc.nextLine();
       System.out.println("enter shift");
       int shift=sc.nextInt();
       str=str.toUpperCase();
       int l=str.length();
       String s="";
       if(shift<=26)
       {
           for(int i=0;i<l;i++)
           {
               char ch=str.charAt(i); 
               ch+=shift-1;
               if(shift>90)
                  ch-=26;
               s+=(char)ch;
            }
            s=s.replace("QQ"," ");
            System.out.println(s);
        }
        else
        {
            System.out.println("invalid shift value");
            System.exit(0);
        }
    }
}
/*SAMPLE OUTPUT
enter encrypted code
uhinbylkkqchhylkk
enter shift
7
[NOTH_R WINN_R 
*/