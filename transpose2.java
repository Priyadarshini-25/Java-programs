
/**
 * Write a description of class transpose2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class transpose2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int r=sc.nextInt();
        System.out.println("enter no. of columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("enter element");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original 2D array");
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<r;j++)
            {
                int temp=a[i][j]; 
                a[i][j]=a[j][i]; 
                a[j][i]=temp;
            }
        }
        System.out.println("transposed array");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}
