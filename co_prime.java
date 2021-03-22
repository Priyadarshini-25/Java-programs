
/**
 * Write a description of class co_prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class co_prime
{
    boolean prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        if(c==2)
        return true;
        return false;
    }
    
    boolean hcf(int y,int z)
    {
        int min=Math.min(y,z);
        int hcf=0;
        for(int i=1;i<=min;i++)
        {
            if(y%i==0&&z%i==0)
            hcf=i;
        }
        if(hcf==1)
        return true;
        return false;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 no.'s");
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        if(prime(a)==true&&prime(b)==true&&hcf(a,b)==true)
        System.out.println("co-prime");
        else
        System.out.println("not co-prime");
    }
}
    
        
        
