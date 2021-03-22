
/**
 * Write a description of class rotation90_2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class rotation90_2D
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows/columns of square matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("enter elements");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        
        int fa[][]=new int[n][n];
        int col=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                fa[i][col]=a[i][j]; 
                col++;
            }
            col=0;
        }
        
        System.out.println("matriz after 90degrees clockwise rotation");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(fa[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
