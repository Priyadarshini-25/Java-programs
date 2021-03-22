
/**
 * Write a description of class transpose1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class transpose1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of square matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int a2[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("enter element");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original array");
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
            for(int j=0;j<n;j++)
            {
                a2[i][j]=a[j][i];
            }
        }
        System.out.println("transposed array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
