
/**
 * Write a description of class automorphic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class automorphic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter a number");
        int n=sc.nextInt();
        int copy=n;
        int p=1;
        int sq=n*n;
        while(copy>0)
        {
            p*=10;
            copy/=10;
        }
        if(sq%p==n)
        System.out.println("automorphic number");
        else
        System.out.println("not an automorphic number");
    }
}
