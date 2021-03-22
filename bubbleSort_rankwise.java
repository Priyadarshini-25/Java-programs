
/**
 * Write a description of class bubbleSort_rankwise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bubbleSort_rankwise
{
   static void main()
   {
       Scanner sc=new Scanner(System.in);
       double mark[]=new double[10];
       System.out.println("enter marks of 10 students out of 100");
       for(int i=0;i<10;i++)
       {
           mark[i]=sc.nextDouble();
       }
       
       for(int i=0;i<10-1;i++)
        {
            for(int j=0;j<10-1-i;j++)
            {
                if(mark[j]<mark[j+1])
                {
                    double temp=mark[j];
                    mark[j]=mark[j+1];
                    mark[j+1]=temp;
                }
            }
        }
        System.out.println("rankwise marks are");
        for(int i=0;i<10;i++)
        {
            System.out.println(mark[i]+" ");
        }
    }
}
