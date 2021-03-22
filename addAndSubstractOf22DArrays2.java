
/**
 * Write a description of class pro2_addAndSubstractOf22DSArray2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class addAndSubstractOf22DArrays2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of both the 2D arrays");
        int r=sc.nextInt();
        System.out.println("enter no. of columns of both the 2D arrays");
        int c=sc.nextInt();
        int ar1[][]=new int[r][c];  
        int ar2[][]=new int[r][c];
        System.out.println("enter the elements of the first array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of the second array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar2[i][j]=sc.nextInt(); 
            }
        }
        
            System.out.println("the added array is");
            for(int i=0;i<r;i++)
           {
            for(int j=0;j<c;j++)
            {
               System.out.print((ar1[i][j]+ar2[i][j])+"\t");
            }
            System.out.println();
           }
        
            System.out.println("the substracted array is");
             for(int i=0;i<r;i++)
             {
            for(int j=0;j<c;j++)
              {
               System.out.print((ar1[i][j]-ar2[i][j])+"\t");
              }
            System.out.println();
             }
        
        
    }
}
/*
 * enter no. of rows of both the 2D arrays
3
enter no. of columns of both the 2D arrays
2
enter the elements of the first array
1
2
3
4
5
6
enter the elements of the second array
6
5
4
3
2
1
the added array is
7	7	
7	7	
7	7	
the substracted array is
-5	-3	
-1	1	
3	5	

 */
            
            
            
            
