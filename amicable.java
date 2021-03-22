
/**
 * Write a description of class amicable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class amicable
{
    int sumoffactors(int x)
    {
        int s=0;
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
            s+=i;
        }
        return s;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        amicable ob=new amicable();
        System.out.println("enter first number");
        int m=sc.nextInt();
        System.out.println("enter second number");
        int n=sc.nextInt();
        int m1=ob.sumoffactors(m);
        int n1=ob.sumoffactors(n); 
        
        if((m==n1)&&(n==m1))
        System.out.println("amicable numbers");
        else
        System.out.println("not amicable numbers");
    }
}



