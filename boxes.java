
/**
 * Write a description of class boxes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class boxes
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of boxes");
        int n=sc.nextInt();
        int copy=n;
        int totalCarton=0;
        int c=0;
        int cart[]={48,24,12,6};
        
        for(int i=0;i<4;i++)
        {
            c=copy/cart[i];
            if(c!=0)
            {
                System.out.println(cart[i]+" x "+c+"="+(cart[i]*c));
            }
            totalCarton+=c;
            copy=copy%cart[i];
        }
        if(copy!=0)
        {
            System.out.println("extra carton: "+copy+" x "+"1"+"="+copy);
            totalCarton+=1;
        }
        else
        {
            System.out.println("number of extra cartons = 0");
        }
        System.out.println("number of boxes= "+n);
        System.out.println("total number of cartons required= "+totalCarton);
    }
}
