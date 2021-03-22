
/*WAP which will input an square/rectangular array and diaplay only the boundary elements 
 * and replace all the inner elements with ":)"
 * 
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:TAKE THE INPUT OF THE NO. OF ROWS OF THE 2D ARRAY,STORE IN r
 * STEP 3:TAKE THE INPUT OF THE NO. OF COLUMNS OF THE 2D ARRAY,STORE IN c
 * STEP 4:INITIALIZE AN INTEGER 2D ARRAY OF DIMENTIONS r*c
 * STEP 5:TAKE INPUT OF THE ELEMENTS OF THE 2D ARRAY FROM USER
 * STEP 6:DISPLAY ORIGINAL ARRAY
 * STEP 7:RUN AN OUTER FOR LOOP(int i=0;i<r;i++)
 * STEP 7.1:RUN AN INNER FOR LOOP(int j=0;j<c;j++)
 * STEP 7.1.1:IF(i==0||j==0||i==r-1||j==c-1)THEN PRINT ELEMENTS ITSELF I.E ARRAY ELEMENT WITH INDEX[i][j]
 * STEP 7.1.2:ELSE PRINT(":)")
 * STEP 8:END
 */
import java.util.*;
public class boundaryElements2D_pro5
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
               System.out.println("enter elements ");
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original array");
        for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               System.out.print(a[i][j]+"\t");
               
            }
            System.out.println();
        }
        System.out.println("modified array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||j==0||i==(r-1)||j==(c-1))  
                System.out.print(a[i][j]+"\t");
                else
                System.out.print(":)"+"\t");
            }
            System.out.println();
        }
    }
}
/*enter no. of rows
5
enter no. of columns
5
enter elements 
1
enter elements 
2
enter elements 
3
enter elements 
4
enter elements 
5
enter elements 
6
enter elements 
7
enter elements 
8
enter elements 
9
enter elements 
10
enter elements 
11
enter elements 
12
enter elements 
13
enter elements 
14
enter elements 
15
enter elements 
16
enter elements 
17
enter elements 
18
enter elements 
19
enter elements 
20
enter elements 
21
enter elements 
22
enter elements 
23
enter elements 
24
enter elements 
25
original array
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25	
modified array
1	2	3	4	5	
6	:)	:)	:)	10	
11	:)	:)	:)	15	
16	:)	:)	:)	20	
21	22	23	24	25	
*/
