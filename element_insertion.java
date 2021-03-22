
/**
 * Write a description of class element_insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class element_insertion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[50];
        System.out.println("enter no. of array elements");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("enter element to be inserted");
        int insert=sc.nextInt();
        System.out.println("enter position of insertion");
        int pos=sc.nextInt();
        for(int i=n-1;i>=pos;i--) 
        {
            array[i+1]=array[i]; 
        }
        array[pos]=insert;
        n++;
        System.out.println("array elements after insertion");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ,");
        }
    }
}
        
        
        

       
        
        
