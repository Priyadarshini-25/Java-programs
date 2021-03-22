
/*WAP to check whether the inputed string is unique or not,
 * a string is said to be unique,is all the characters of the word appear only once
 * example=>abcdef
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:TAKE INPUT OF A WORD FROM USER,CONVERT IT INTO UPPER CASE,TRIM IT 
 * (I.E REMOVE ALL EXCESS BLANKS FROM BOTH ENDS)
 * STEP 3:CALCULATE THE NO. OF CHARACTERS PRESENT IN THE WORD AND STORE IT IN l
 * STEP 4:INITIALIZE char c to'\u0000',boolean f to true, int count to 0
 * STEP 5:RUN A LOOP FORM 'A' TO 'Z'
 * STEP 5.1:RUM A INNER LOOP FROM THE LEFT MOST CHARACTER TO RIGHT MOST CHARACTER OF THE WORD
 * STEP 5.1.1:CALCULATE THE FREQUENCY OF EACH CHARACTER OF WORD
 * STEP 5.1.2:IF FREQUENCY OF EACH CHARACTER GREATER THAN 1,MAKE f TRUE AND BREAK AND PRINT("NOT UNIQUE")
 * STEP 5.1.3:ELSE GOTO STEP-5.1.1
 * STEP 6:IF(F==true),THEN PRINT("UNIQUE")
 * STEP 7:ELSE PRINT("NOT UNIQUE")
 * STEP 8:END
 */
import java.util.*;
public class uniqueString_pro4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=s.trim();
        int l=s.length();
        char c;
        int count=0;
        boolean f=true;
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<l;j++)
            {
                c=s.charAt(j);
                if(c==(char)i)
                count++;
            }
            if(count>1)
            {
                f=false;
                break;
            }
            count=0;
        }
        if(f==true)
        System.out.println("the given string is unique");
        else
        System.out.println("the given string is not unique");
    }
}
/*enter string
COFFEE
the given string is not unique
*/
