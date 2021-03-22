
/**
 * Write a description of class harshad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class harshad
{
    boolean isHarshad(int n)
    {
        int s=0;
        for(int i=n;i>0;i/=10)
        {
            s+=i%10;
        }
        if(n%s==0)
        return true;
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        harshad ob=new harshad();
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(ob.isHarshad(n)==true)
        System.out.println("harshad number");
        else
        System.out.println("not a harshad number");
    }
}



        
