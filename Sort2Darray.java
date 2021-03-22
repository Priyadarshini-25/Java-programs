
/**
 * Write a description of class Sort2Darray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Sort2Darray
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int r=sc.nextInt();
        System.out.println("enter no. of columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("elements before sorting");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int k=0;k<r;k++)
        {
            for(int l=0;l<c;l++)
            
            for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                if(a[k][l]>a[i][j])
                {
                    int temp=a[k][l];
                    a[k][l]=a[i][j];
                    a[i][j]=temp;
                }
            }
        }
        
        System.out.println("elements after sorting");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*SAMPLE OUTPUT
   enter no. of rows
3
enter no. of columns
4
enter elements
2
7
6
5
3
9
6
1
9
10
16
43
elements before sorting
2	7	6	5	
3	9	6	1	
9	10	16	43	
elements after sorting
43	16	10	9	
9	7	6	6	
5	3	2	1	
*/
