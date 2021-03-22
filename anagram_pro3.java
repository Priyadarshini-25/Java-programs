
/*
 * WAP to check whether the 2 words are anagrams or not
 * 2 words are said to be anagrams,if all the characters of the word 1 are contained in the word 2 
 * just in different positions
 * example=>abcdefg & defgbca
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:ENTER 2 WORDS FROM USER AND STORE IT IN a1 &a2 RESPECTIVELY
 * STEP 3:CONVERT THE INPUTER WORDS INTO LOWER CASE AND STORE IT IN s1&s2 RESPECTIVELY
 * STEP 4:CALCULATE THE NO. OF CHARACTERS PRESENT IN s1 &s1 AND STORE THEM IN l1 &l2 RESPECTIVELY
 * STEP 5:INITIALIZE char ch1 AND ch2 TO '\u0000' AND Strings k and g to ""
 * STEP 6:IF (l1==l2)
 * STEP 6.1:RUN character LOOP FROM 'a'-'z'
 * STEP 6.1.1:EXTRACT CHARACTER FROM s1 AND STORE IT IN k IN ALPHABETICAL ORDER
 * STEP 6.1.2:EXTRACT CHARACTER FROM s2 AND STORE IT IN g IN ALPHABETICAL ORDER
 * STEP 6.2:IF (k.equalsIgnoreCase(g)==true)
 * STEP:6.2.1:THEN PRINT("ANAGRAMS")
 * STEP:6.2.2:ELSE PRINT("NOT ANAGRAMS")
 * STEP 6.4:PRINT("NOT ANAGRAMS");
 * STEP 7:END
 */
import java.util.*;
public class anagram_pro3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 strings to check for anagrams");
        String a1=sc.nextLine();
        String a2=sc.nextLine();
        String s1=a1.replaceAll("\\s","").toLowerCase();
        String s2=a2.replaceAll("\\s","").toLowerCase();
        int l1=s1.length();
        int l2=s2.length();
        char ch1,ch2;
        String k="";
        String g="";
        if(l1==l2)
        {
            for(int j=97;j<=122;j++)
            {
                for(int i=0;i<l1;i++)
                {
                    char ch=s1.charAt(i);
                    if(ch==j)
                    {
                        k=k+ch;
                    }
                }
                for(int u=0;u<l2;u++)
                {
                    char ch=s2.charAt(u);
                    if(ch==j)
                    {
                        g=g+ch;
                    }
                }
            }
            if(k.equalsIgnoreCase(g)==false)
            {
                System.out.println(a1+" and "+a2+" are not anagrams ");
            }
            else
            {
                
                System.out.println(a1+" and "+a2+" are anagrams ");
            }
        }
        else
        {
            System.out.println(a1+" and "+a2+" are not anagrams ");
        }
    }
}
/*Sample output
 * enter 2 strings to check for anagrams
mother in law
hitler woman
mother in law and hitler woman are anagrams 
*/
 
            
