
/**
 * Write a description of class compositeMagic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class compositeMagic
{
    boolean isComposite(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        if(c>2)
        return true;
        return false;
    }
    int sumDigits(int x)
    {
        int s=0;
        while(x>0)
        {
            s+=(x%10);
            x/=10;
        }
        return s;
    }
    boolean isMagic(int x)
    {
        int a=sumDigits(x);
        while(a>9)
        {
            a=sumDigits(a);
        }
        if(a==1)
        return true;
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        compositeMagic ob=new compositeMagic();
        System.out.print("M=");
        int m=sc.nextInt();
        System.out.println("");
        System.out.print("N=");
        int n=sc.nextInt();
        int c=0;
        int i=m;
        System.out.println("composite magic numbers are");

        while(i<=n)
        {
            if(ob.isComposite(i)==true&&ob.isMagic(i)==true)
            {
                if(c==0)
                System.out.print(i);
                else
                System.out.print(","+i);
                c++;
            }
            i++;
        }
        System.out.println("");
        System.out.println("frequency of composite magic numbers is "+c);
    }
}




