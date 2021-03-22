
/**
 * Write a description of class disariumNo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class disariumNo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int copy=n;
        int c=0;
        int s=0;
        while(copy>0)
        {
            c++;
            copy/=10;
        }
        for(int i=n;i>0;i/=10)
        {
            int dig=i%10;
            s+=Math.pow(dig,c);
            c-=1;
        }
        if(n==s)
        System.out.println("disarium number");
        else
        System.out.println("not a disarium number");
    }
}
        
