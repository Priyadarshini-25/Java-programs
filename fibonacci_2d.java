
/**
 * Write a description of class fibonacci_2d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class fibonacci_2d
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows and columns");
        int n=sc.nextInt();
        for(int k=0;k<=n;k++)
        {
            if(isFibonacci(k)==true)
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<n;j++)
                {
                  System.out.print(k+"\t");
                }
                System.out.println();
            }
        }
    }
    
    boolean isFibonacci(int num)
    {
        int flag=0;
        if(num==0||num==1)
        {
            flag=1;
        }
            
         else     
           {
               int a=0,b=1,c=0;
               for(int i=2;i<=num*num;i++)
               {
                   c=a+b;
                   a=b;
                   b=c;
                   if(c==num)
                   flag=1;
                }
            }
            if(flag==1)
            return true;
            return false;
        } 
    }

               
