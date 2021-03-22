
/**
 * Write a description of class arrar2d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class array2d
{
   void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no. of rows (taking no. of rows =no. of columns)");
       int r=sc.nextInt();
       int a[][]=new int[r][r];
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<r;j++)
           {
               System.out.println("enter element");
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D array :)");
        for(int i=0;i<r;i++)
       {
           for(int j=0;j<r;j++)
           {
               System.out.print(a[i][j]+"\t");
            }
           System.out.println();
        }
        
       int s=0;
       for(int i=0;i<r;i++)
       s+=a[i][i];
       
       int pos=r-1;
       for(int i=0;i<r;i++)
       s+=a[i][pos--];
       
       int mid=r/2;
       if(r%2==0)
       System.out.println("sum of diagonal elements is "+s);
       else 
       {
           s=s-a[mid][mid];
       System.out.println("sum of diagonal elements is "+s);   
    }
    }
}
