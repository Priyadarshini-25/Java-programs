
/**
 * Write a description of class anagram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class anagram
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 Strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        int l1=s1.length();
        int l2=s2.length();
        String s3="";
        if(l1!=l1)
        {
            System.out.println("not anagram");
            System.exit(0);
        }
        else
        {
            for(int i=0;i<l1;i++)
            {
                char ch1=s1.charAt(i);
                for(int j=0;j<l2;j++)
                {
                    char ch2=s2.charAt(j);
                    if(ch1==ch2)
                    {
                        s3+=ch1;
                        break;
                    }
                }
            }
            if(s1.equals(s3))
            System.out.println("anagram");
            else
            System.out.println("not anagram");
        }
    }
}
        
        
