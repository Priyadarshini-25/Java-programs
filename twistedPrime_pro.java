
/**
 * Write a description of class twistedPrime_pro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class twistedPrime_pro
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        System.out.println("TWISTED PRIME=a no. which is prime and even the no.'s reverse is prime,example 13");
        int n=sc.nextInt();
        int c1=0,c2=0,n2=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) 
            c1++; 
        }
        
        for(int i=n;i>0;i/=10)
        {
            int digit=i%10;
            n2=n2*10+digit;
        }
        for(int i=1;i<=n2;i++)
        {
            if(n2%i==0)
            c2++;
        }
        if(c1==2&&c2==2)
        System.out.println("Twisted Prime");
        else
        System.out.println("not Twisted Prime");
    }
}
