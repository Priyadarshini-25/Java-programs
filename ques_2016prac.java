
/**
 * Write a description of class ques_2016prac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ques_2016prac
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int s=sc.nextInt();
        System.out.println("enter 1st character");
        char ch1=sc.next().charAt(0);
        System.out.println("enter 2nd character");
        char ch2=sc.next().charAt(0);
        System.out.println("enter 3rd character");
        char ch3=sc.next().charAt(0);
        char ar[][]=new char[s][s];
        
        int k=s-1; 
        for(int i=0;i<s;i++) 
        {
            for(int j=k;j>=0;j--) 
            {
                if(i!=j&&(i+j)!=s-1)
                {
                    if(i<j)
                    ar[i][j]=ch1; 
                    
                    if(i>j)
                    ar[i][j]=ch2;
                }
                k--;
            }
        }
            k=0;
            
            for(int i=s-1;i>=0;i--)  
            {
                for(int j=k;j<s;j++)
                {
                    if(i!=j&&(i+j)!=s-1)
                    {
                        if(i<j)
                        ar[i][j]=ch2;
                        
                        if(i>j)
                        ar[i][j]=ch1;
                    }
                }
                k++;
            }
            
            for(int i=0;i<s;i++)
            {
                for(int j=0;j<s;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }

    
