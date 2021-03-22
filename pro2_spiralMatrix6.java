
/**
Write a Program in Java to fill a square matrix of size ‘n*n” in a spiral fashion (from the inside) with natural numbers from 1 to n*n, taking ‘n’ as input.

For example: if n = 5, then n*n = 25, hence the array will be filled as given below.

circular spiral matrix-1

Note: Don’t be confused as to how the filling will start from the center. Just treat the above program as (see the difference in the direction of the arrows):

circular spiral matrix-2

 

So, you see, this question is nothing but the same circular matrix which we did earlier (See: Java Program to print Circular (Spiral) Matrix). The only change is that here the filling of numbers is from ‘n*n’ to 1 every time decreasing by one. In the earlier program it was from 1 to ‘n*n’ every time increasing by one.

So slight changes in our earlier program will result into this new spiral matrix. The changes will be:

Start ‘k’ from ‘n*n’ and not 1
Change the condition in while loop to while(k >= 1)
Decrease the value of ‘k’ every time as ‘k- -‘

*/
 
import java.io.*;
class pro2_spiralMatrix6
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of elements : ");
            int n=Integer.parseInt(br.readLine());
 
            int A[][]=new int[n][n];
            int k=n*n, c1=0, c2=n-1, r1=0, r2=n-1;
 
            while(k>=1)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        A[r1][i]=k--;
                    }
 
                    for(int j=r1+1;j<=r2;j++)
                    {
                        A[j][c2]=k--;
                    }
 
                    for(int i=c2-1;i>=c1;i--)
                    {
                        A[r2][i]=k--;
                    }
 
                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        A[j][c1]=k--;
                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            /* Printing the Circular matrix */
            System.out.println("The Circular Matrix is:");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(A[i][j]+ "\t");
                        }
                 System.out.println();
                }
        }
    }
/*
 * Enter the number of elements :5
 * the Circular Matrix is:
 *25    24  23  22  21
 *10    9   8   7   20
 *11    2   1   6   19
 *12    3   4   5   18
 *13    14  15  16  17
 */
