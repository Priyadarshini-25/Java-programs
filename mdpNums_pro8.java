
/*WAP based on MDP where the user can choose the type of no. to 
 * check(automorphic,kaprekar or magic or to exit)
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:PRINT CHOICES FOR THE USER
 * STEP 3:TAKE INPUT OF THE CHOICE FROM THE USER
 * STEP 4:INITIALIZE n=0
 * STEP 5:START switch case ON THE CHOICE INPUTER BY USER
 * STEP 6.1:IF CHOICE IS FOR THE AUTOMORPHIC NO.,TAKE INPUT OF THE NO. TO BE CHECKED FROM USER
 * PASS IT INTO METHOD checkAutomorphic(int),THEN IF THE RETURNED VALUE IS true ,DISPLAY YES ELSE NO
 * STEP 6.2:IF CHOICE IS FOR THE KAPREKAR NO.,TAKE INPUT OF THE NO. TO BE CHECKED FROM USER
 * PASS IT INTO METHOD checkKaprekar(int),THEN IF THE RETURNED VALUE IS true ,DISPLAY YES ELSE NO
 * STEP 6.3:IF CHOICE IS FOR THE MAGIC NO.,TAKE INPUT OF THE NO. TO BE CHECKED FROM USER
 * PASS IT INTO METHOD checkMagic(int),THEN IF THE RETURNED VALUE IS true ,DISPLAY YES ELSE NO
 * STEP 6.4:IF CHOICE IS FOR EXITING ,THEN System.exit(0)
 * STEP 6.5:IF THE CHOICE INPUTED BY THE USER MATCHES NONE OF THE CASES 
 * THEN PRINT("WRONG CHOICE enter no.'s between 1-4")
 * STEP 7:END 
 */
import java.util.*;
public class mdpNums_pro8
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. To check Automorphic no. EXAMPLE=5=5^2=25=25%10=5 and 25=25^2=625=625%100=25");
        System.out.println("2. To check Kaprekar no. EXAMPLE=297=297^2=88209=88+209=297");
        System.out.println("3. To check Magic no. EXAMPLE=91=9+1=10=1+0=1 and 7777=7+7+7+7=28=2+8=10=1+0=1");
        System.out.println("4. To exit");
        System.out.println("enter choice");
        int ch=sc.nextInt();
        int n=0;
        switch(ch)
        {
            case 1:System.out.println("enter no. to check for Automorphic");
            n=sc.nextInt();
            if(checkAutomorphic(n)==true)
            System.out.println("no. is automorphic");
            else
            System.out.println("no. is not automorphic");
            break;
            
            case 2:System.out.println("enter no. to check for kaprekar");
            n=sc.nextInt(); 
            if(checkKaprekar(n)==true)
            System.out.println("no. is kaprekar");
            else
            System.out.println("no. is not kaprekar");
            break;
            
            case 3:System.out.println("enter no. to check for magic");
            n=sc.nextInt();
            if(checkMagic(n)==true)
            System.out.println("no. is magic");
            else
            System.out.println("no. is not magic");
            break;
            
            case 4:System.exit(0);
            
            default:System.out.println("WRONG CHOICE enter no.'s between 1-4");
        }
    }
    
    boolean checkAutomorphic(int a)
    {
        int copy=a,sq=a*a,p=1;
        while(a>0)
        {
            p*=10;
            a/=10;
        }
        if(sq%p==copy)
        return true;
        return false;
    }
    boolean checkKaprekar(int a)
    {
        int copy=a,sq=a*a,p=1;
        while(a>0)
        {
            p*=10;
            a/=10;
        }
        if((sq%p+sq/p)==copy)
        return true;
        return false;
    }
    boolean checkMagic(int a)
    {
        while(a>9)
        {
            int s=0;
            while(a>0)
            {
                s+=a%10;
                a/=10;
            }
            a=s;
        }
        if(a==1)
        return true;
        return false;
    }
}
            
                                                                