
/*
 */
import java.util.*;
public class pro2_diagonalsCorner4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter no. of rows of square matrix");
        int n=sc.nextInt();
        if(n<3||n>10)
        {
            System.out.println("WRONG INPUT! enrer within 3-10");
            System.exit(0);
        }
        else
        {
            int a[][]=new int[n][n];
            System.out.println("enter array elements");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
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
            
            int diagonal=0;
            int corner=0;
            System.out.println("diagonal elements");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j||((i+j)==(n-1)))
                    System.out.print(a[i][j]+"\t");  
                    else
                    System.out.print("\t");
                }
                System.out.println("\t");
            }
            
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j||(i+j)==(n-1))
                    diagonal+=a[i][j];  
                }
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if((i==0&&j==0)||(i==0&&j==n-1)||(i==n-1&&j==0)||(i==n-1&&j==n-1))
                    corner+=a[i][j];
                }
            }
            
            System.out.println("sum of diagonal elements "+diagonal); 
            System.out.println("sum of corner elements "+corner);
        }
    }
}
/*SAMPLE OUTPUT:
enter no. of rows of square matrix
3
enter array elements
1
2
3
4
5
6
7
8
9
original array
1	2	3	
4	5	6	
7	8	9	
diagonal elements
1		3		
	5			
7		9		
sum of diagonal elements 25
sum of corner elements 20
*/
