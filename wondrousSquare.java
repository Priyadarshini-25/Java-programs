
/**
 * Write a description of class wondrousSquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class wondrousSquare
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {   
         System.out.println("enter no. of rows or columns(2-10)");
         n=sc.nextInt();
        }
        while(n<2||n>10);
        
         int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("enter a value between 1 and "+n*n);
                int val=sc.nextInt();
                if(val<1||val>n*n)
                j--;
                else
                a[i][j]=val;
            }
        }
        
        double formula=(0.5*n*((n*n)+1));
        int flag=0;double s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s1+=a[i][j];
                s2=a[j][i];
            }
            if(s1==formula||s2==formula)
            {
                flag=1;
                break;
            }
            s1=0;
            s2=0;
        }
        if(flag==1)
        System.out.println("wondrous square");
        else
        System.out.println("not wondrous square");
        System.out.println("Prime+\t+row index+\t+column index"); 
        for(int k=2;k<=n*n;k++)
        {
            if(isPrime(k)==true) 
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++) 
                {
                    if(k==a[i][j])
                    System.out.println(k+"\t"+i+"\t"+j);
                }
            }
        }
    }
    
        boolean isPrime(int num)
        {
            int c=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                c++;
            }
            if(c==2)
            return true;
            return false;
        }
}
