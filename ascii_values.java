
/**
 * Write a description of class ascii_values here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ascii_values
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        int len=s.length();
        int ascii=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            ascii=ch;
            System.out.println("ASCII value of "+ch+"="+ascii);
        }
    }
}
        
    
