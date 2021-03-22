
/**
 * Write a description of class unique_no here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class unique_no
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. range");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(isUnique(i)==true)
            System.out.println(i);
        }
    }
    boolean isUnique(int a)
    {
        String a2=Integer.toString(a);
        int len=a2.length();
        int c=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                char ch1=a2.charAt(i);
                char ch2=a2.charAt(j);
                if(ch1==ch2)
                {
                    c++;;
                }
            }
            if(c>1)
            return false;
            else
            {
                c=0;
                continue;
            }
        }
    }    
}
    
