
/**
 * Write a description of class evilNo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class evilNo
{

    
    String binaryEquivalent(int x)
    {
        char dig[]={'0','1'};
        int rem=0;
        String s="";
        while(x>0)
        {
            rem=x%2;
            s=dig[rem]+s;
            x/=2;
        }
        return s;
    }
    
    int numone(String x)
    {
        int len=x.length();
        int c=0;
        for(int i=0;i<len;i++)
        {
            char ch=x.charAt(i);
            if(ch=='1')
            c++;
        }
        return c;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        evilNo ob=new evilNo();
        System.out.println("enter number in decimals");
        int n=sc.nextInt();
        if(n>0)
        {
            String bin=ob.binaryEquivalent(n);
            int c=ob.numone(bin);
            System.out.println("INPUT: "+n);
            System.out.println("BINARY EQUIVALENT: "+bin);
            System.out.println("NO. OF 1's: "+c);
            if(c%2==0)
            System.out.println("OUTPUT: EVIL NUMBER");
            else
            System.out.println("OUTPUT: NOT AN EVIL NUMBER");
        }
        else
        System.out.println("INVALID INPUT");
    }
}
 
        
    
