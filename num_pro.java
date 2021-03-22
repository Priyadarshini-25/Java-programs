
/**
 * Write a description of class num_pro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class num_pro
{
   void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.'s...to stop enter zero(0)and output will be the sum of odd positive and even negative seperately.");
       int op=0,en=0;
       
       while(true)
       {
           System.out.println("enter no.'s...to stop 0");
           int n=sc.nextInt();
           if(n==0)
           break;
           else if(n>0&&(n%2==1))
           op+=n;
           else if(n<0&&(n%2==0))
           en+=n;
        }
        System.out.println("sum of odd positive "+op);
        System.out.println("sum of even negative "+en);
    }
}
