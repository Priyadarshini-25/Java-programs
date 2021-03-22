
/*WAP to take input of an ISBN no. and check whether it is valid or not
 * validity protocol=13 digits,sum=1st digit*1+2nd digit*2...+last digit*13,
 * and sum should be divisible by 11
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:TAKE INPUT OF THE ISBN NO. FROM THE USER,STORE IT IN n
 * STEP 3:INITIALIZE c TO 0,AND pos TO 1
 * STEP 4:COUNT THE NO. OF DIGITS PRESENT IN THE NO. BY INCREMENTING THE VALUE OF c BY 1
 * STEP 5:IF CALUE OF c IS NOT 13,THEN GOTO 6  ELSE System.exit(0);
 * STEP 6:ELSE
 * STEP 6.1: INITIALIZE s OF LOND DATATYPE TO 0
 * STEP 6.2:RUN while(n>0)
 * STEP 6.2.1:EXTRACT DIGIT AND s+=digit*(pos++) and n/=10 
 * STEP 7:IF THE s IS DIVISIBLE BY 11 THEN PRINT("legal ISBN") ELSE PRINT("illegal ISBN")
 * STEP 8:END
 */
import java.util.*;
public class isbn_pro10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ISBN");
        System.out.println("validity protocol=13 digits,sum=1st digit*1+2nd digit*2...+last digit*13,and sum should be divisible by 11");
        long n=sc.nextLong();     
        long c=0;
        for(long i=n;i>0;i/=10) 
        c++;
        long pos=1;
        
        if(c!=13)
        {
            System.out.println("illegal ISBN");
            System.exit(0);
        }
        else
        {
            long s=0;
            while(n>0)
            {
                long digit=n%10; 
                s+=digit*pos;
                pos++;
                n/=10;
            }
            if(s%11==0)
            System.out.println("legal ISBN");
            else
            System.out.println("illegal ISBN");
        }
    }
}
