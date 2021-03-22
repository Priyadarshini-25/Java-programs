
/**
 * Write a description of class password here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class password
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        String pass=sc.nextLine();
        if(pass.equalsIgnoreCase("zombie"))
        {
            System.out.println("1. continue");
            System.out.println("2. exit");
            System.out.println("enter choice 1/2");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:for(long i=0;i<=999999999;i++);     
                System.out.println("loading...");
                break;
                case 2:System.exit(0);
                break;
                default:System.out.println("BAKWAAS");
            }
        }
        else
        System.out.println("incorrect ,access denied");
    }
}
