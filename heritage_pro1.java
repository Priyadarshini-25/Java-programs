
/**
 * Write a description of class heritage_pro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class heritage_pro1
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of sentences to be inputed");
        int n=sc.nextInt();
        while(true)
        {
            if(n>=1&&n<=10)
            break;
            
            else
            System.out.println("enter correct size 1-10");
            n=sc.nextInt();
        }
    String xx=sc.nextLine();
    String arr[]=new String[n];
    
    System.out.println("enter sentences");      
    for(int i=0;i<n;i++)    
    {

        arr[i]=sc.nextLine();
    }
     for(int j=1;j<=n;j++)
     {
         if(j%2!=0)
         System.out.println(oddSen(arr[j-1])); 
         else
         System.out.println(evenSen(arr[j-1]));
        }
        
    }
    String oddSen(String s)
    {
        s=s.toUpperCase();
        s=s+" ";
        int len=s.length();
        String w="";
        String newsen="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            w+=ch;
            else
            newsen=w+" "+newsen;
            w="";
        }
        return newsen;
    }
    String evenSen(String s)
    {
        s=s.toUpperCase();
        s=s+" ";
        int len=s.length();
        String newsen="";
        String w1="";
        String w="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            w+=ch; 
            else
            {
                int len1=w.length();
                for(int j=0;j<len1;j++)
                {
                    char ch1=w.charAt(j);
                    if(ch1=='Y')
                    w1+='A';
                    else if(ch1=='Z')
                    w1+='B';
                    else if(ch1>='A'&&ch1<='X')
                    w1+=(char)(ch1+2);
                }
                newsen=newsen+" "+w1;
                w1="";
                w="";
            }
        }
        return newsen;
    }
}
            
