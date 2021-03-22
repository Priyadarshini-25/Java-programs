
/**
 * Write a description of class output1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class output1
{
    void main()
    {
        int ar[]={2,0,0,0,0,0,0,0,0,0};
        int x,j=1;
        int dividend=2;
        int n=30;
        while(dividend<=n)
        {
            for(x=2;x<dividend;x++)
            {
                if(dividend%2==0)
                break;
                if(x==dividend-1)
                ar[j++]=dividend;
            }
            dividend++;
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}
