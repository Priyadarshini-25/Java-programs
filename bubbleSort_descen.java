
/**
 * Write a description of class bubbleSort_descen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bubbleSort_descen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("enter array element");
            n[i]=sc.nextInt(); 
        }
        for(int i=0;i<10-1;i++)
        {
            for(int j=0;j<10-1-i;j++)
            {
                if(n[j]<n[j+1])
                {
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("array in descending order is");
        for(int i=0;i<10;i++)
        {
            System.out.print(n[i]+" ,");
        }
    }
}
