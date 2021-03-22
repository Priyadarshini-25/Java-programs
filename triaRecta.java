
/**
 * Write a description of class triaRecta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class triaRecta
{
   void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("a. triangular no.");
       System.out.println("b. rectangular no.");
       System.out.println("enter your choice");
       char ch=sc.nextLine().charAt(0);
       System.out.println("enter no.");
       int n=sc.nextInt();
       
       switch(ch)
       {
           case 'a':
           case 'A':if(isTriangular(n)==true)
           System.out.println("yes");
           else
           System.out.println("no");
           break;
           
           case 'b':
           case 'B':if(isTriangular(n)==true)
           System.out.println("yes");
           else
           System.out.println("no");
           break;
           
           default:System.out.println("wrong choice");
        }
    }
    
    boolean isTriangular(int a)
    {
        int s=0,flag=0;
        for(int i=0;i<=a;i++)
        {
            s+=i+(i+1);
            if(s==a)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return true;
        return false;
    }
    boolean isRectangular(int a)    
    {
        int pro=1,flag=0;
        for(int i=0;i<=a;i++)
        {
            pro=i*(i+1);
            if(pro==a) 
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return true;
        return false;
    }
}
