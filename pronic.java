
/**
 * Write a description of class pronic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class pronic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("pronic number");
        else
        System.out.println("not a pronic number");
    }
}
