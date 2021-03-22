
/**
 * Write a description of class arrayMerge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class arrayMerge
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of old students");
        int len=sc.nextInt();
        String old[]=new String[len];
        System.out.println("enter names");
        for(int i=0;i<len;i++)
        {
            old[i]=sc.next();
        }
        System.out.println("enter no. of new students");
        int len2=sc.nextInt();
        String newa[]=new String[len2]; 
        System.out.println("enter names");
        for(int i=0;i<len2;i++)
        {
            newa[i]=sc.next(); 
        }
        String finala[]=new String[len+len2];
        int c=0;
        
        for(int i=0;i<finala.length;i++)
        {
            if(i<len)
            finala[i]=old[i];
            else
            {
                finala[i]=newa[c];
                c++;
            }
        }
        
        System.out.println("final array list is");
        for(int i=0;i<finala.length;i++)
        System.out.print(finala[i]+" ,");
    }
}
            
