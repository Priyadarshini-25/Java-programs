
/**
 * Write a description of class pro_primePalindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class pro2_primePalindromeRecur1
{
   int n;
   int count;
   int rev;
   
   int checkPrime(int x,int i)
   {
       if(i<=x)
       {
           if(x%i==0)
           count++;
           return checkPrime(x,i+1);
        }
        else
        return count;
    }
    
    int checkPalindrome(int x)
    {
        if(x>0)
        {
            int digit=x%10;
            rev=rev*10+digit;
            return checkPalindrome(x/10); 
        }
        else
        return rev;
    }        
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        int copy=n;
        int counter=checkPrime(n,1);
        int reverse=checkPalindrome(n); 
        if(counter==2&&reverse==copy)
        System.out.println(n+" is prime palindrome");
        else
        System.out.println(n+" is not prime palindrome");
    }
}
/*
 * enter a number
11
11 is prime palindrome

 */
   
