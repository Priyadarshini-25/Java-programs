
/**
 * Write a description of class practical3_addSubMatrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class pro2_addSubMatrix2
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows of the 2 matrixes ");
        int m=sc.nextInt();
        System.out.println("enter number of columns of the 2 matrixes");
        int n=sc.nextInt();
        if(m<4||m>10||n<4||n>10)
        {
            System.out.println("ENTER NO.'S BETWEEN 4 AND 10");
            System.exit(0);
        }
        else
        {
            int a1[][]=new int[m][n];
            int a2[][]=new int[m][n];
            System.out.println("enter elements for the 1st matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a1[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter elements of the 2nd matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a2[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("the 2 matrixes are");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a1[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a2[i][j]+"\t");
                }
                System.out.println();
            }
            
            System.out.println("1. to add the 2 matrixes  (A+B)");
            System.out.println("2. to substract the 1st matrix from the 2nd  (B-A)");
            System.out.println("3. to substract the 2nd matrix from the 1st  (A-B)");
            System.out.println("enter choice 1/2/3");
            int ch=sc.nextInt();
            int a3[][]=new int[m][n];
            
            switch(ch)
            {
                case 1:System.out.println("A+B");
                for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                   a3[i][j]=a1[i][j]+a2[i][j]; 
                   System.out.print(a3[i][j]+"\t");
                }
                System.out.println();
            }
            break;
            
            case 2:System.out.println("B-A");
             for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                   a3[i][j]=a2[i][j]-a1[i][j]; 
                   System.out.print(a3[i][j]+"\t");
                }
                System.out.println();
            }
            break;
            
            case 3:System.out.println("A-B");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                   a3[i][j]=a1[i][j]-a2[i][j]; 
                   System.out.print(a3[i][j]+"\t");
                }
                System.out.println();
            }
            break;
            
            default:System.out.println("INVALID CHOICE");
            System.exit(0);
        }
    }
  }
}
/*SAMPLE OUTPUT:
enter number of rows of the 2 matrixes 
4
enter number of columns of the 2 matrixes
5
enter elements for the 1st matrix
1
2
3
4
5
6
78
9
43
78
12
34
88
65
12
09
78
54
23
5
enter elements of the 2nd matrix
6
7
34
21
67
99
65
33
22
56
87
23
11
09
122
34
65
21
10
03
the 2 matrixes are
1	2	3	4	5	
6	78	9	43	78	
12	34	88	65	12	
9	78	54	23	5	

6	7	34	21	67	
99	65	33	22	56	
87	23	11	9	122	
34	65	21	10	3	
1. to add the 2 matrixes  (A+B)
2. to substract the 1st matrix from the 2nd  (B-A)
3. to substract the 2nd matrix from the 1st  (A-B)
enter choice 1/2/3
2
B-A
5	5	31	17	62	
93	-13	24	-21	-22	
75	-11	-77	-56	110	
25	-13	-33	-13	-2	
*/
