
/**
 * Write a description of class clockwiseRowSwap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockwiseRowSwap
{
    int m;
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        Syste.out.println(("enter no. of rows");
        m=sc.nextInt();
        System.out.println("enter no. of columns");
        n=sc.nextInt();
        if(m>5||n>5)
        {
            System.out.println("invalid");
            System.exit(0);
        }
        else
        {
            int ar[][]=new int[m][m]
            System.out.println("enter elements");
            for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
    }
    void
