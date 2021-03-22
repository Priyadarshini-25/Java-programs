
/**
 * Write a description of class project_transposeSymmetric here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class pro2_transposeSymmetric3
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
        System.out.println("A matrix is said to be symmetrical when it is equal to the transposed matrix");
        boolean flag=true;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=a2[i][j])
                {
                    flag=false;
                    break;
                }
            }
        }
        
        if(flag==true)
        System.out.println("The entered matrix is symmetrical ");
        else
        System.out.println("The entered matrix is not symmetrical ");
    }
}
/* SAMPLE OUTPUT:
enter no. of rows of square matrix
3
enter element
1
enter element
2
enter element
3
enter element
4
enter element
5
enter element
6
enter element
7
enter element
8
enter element
9
original array
1	2	3	
4	5	6	
7	8	9	
transposed array
1	4	7	
2	5	8	
3	6	9	
A matrix is said to be symmetrical when it is equal to the transposed matrix
The entered matrix is not symmetrical 
*/
