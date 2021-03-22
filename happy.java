
/**
 * Write a description of class happy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class happy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int s=0;
        int copy=n;
        while(s>9)
        {
            while(copy>0)
            {
                int dig=copy%10;
                s+=dig*dig;
                copy/=10;
            }
            copy=s;
        }
        if(s==1)
        System.out.println("happy number");
        else
        System.out.println("unhappy number");
    }
}
