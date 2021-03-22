
/**
 * Write a description of class baseConverter2to10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class baseConverter2to10
{
    int anyBaseTo10(int n,int b)
    {
        int s=0,c=0;
        for(int i=n;i>0;i/=10)
        {
            int d=n%10;
            s+=Math.pow(b,c)*d;
            c++;
        }
        return s;
    }
    
    String base10ToAnyBase(int n,int b)
    {
        String ans="";
        int rem=0;
        for(int i=n;i>0;i/=10)
        {
            rem=i%b; 
            ans+=rem;
        }
        String ans2="";
        int l=ans.length();
        
        for(int i=l-1;i>=0;i--) 
        {
            char ch=ans.charAt(i);
            ans2+=ch;
        }
        return ans2;
    }
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. to convert to base 10");
        int num=sc.nextInt();
        System.out.println("enter its base");
        int b=sc.nextInt();
        System.out.println("enter no. in base 10");
        int num2=sc.nextInt();
        System.out.println("enter base to be converted to");
        int b2=sc.nextInt();
        System.out.println("ans of "+num+" in base 10 is "+anyBaseTo10(num,b));
        System.out.println("ans of "+num2+" to base "+b2+" is "+base10ToAnyBase(num2,b2));
    }
}
