
/*WAP to input a sentence and display the word with the max no. of vowels and 
 * also the no. of vowels in that word
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2::TAKE INPUT OF A SENTENCE FROM THE USER AND STORE IT IN s,CONVERT s TO UPPERCASE,
 * AND ADD A BLANK AT THE END OF THE SENTENCE,
 * CALCULATE THE NO. OF CHARACTERS PRESENT IN THE DTRING AND STORE IT IN len
 * STEP 3:INITIALIZE w to "",maxnovw to "",nov to 0 and maxnov to 0
 * STEP 4:RUN AN OUTER FOR LOOP FROM THE LEFT MOST CHARCTER TO THE RIGHT MOST CHARACTER OF THE SENTENCE
 * STEP 4.1:EXTRACT CHARACTERS AND FORM WORDS
 * STEP 4.2:RUN AN INNER FOR LOOP FROM THE 
 * LEFT MOST CHARACTER TO THE RIGHT MOST CHARACTER OF THE WORD FORMED
 * STEP 4.2.1:EXTRACT CHARACTER , IF IT IS a or e or i or o or u,then nov++ 
 * STEP 4.3:IF(nov>=maxnov)THEN maxnov=nov AND maxnovw=w
 * STEP 4.4:INITIALIZE w to "" AND nov to 0
 * STEP 5:PRINT("word with the maximum no. of vowels is "+maxnovw+" , with no. of vowels "+maxnov)
 * STEP 6:END
 
 */
import java.util.*;
public class word_with_max_vowels_pro9
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=s+" ";
        int len=s.length();
        String w="",maxnovw=""; 
        int nov=0,maxnov=0;
        
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            w+=ch;
            else
            {
                int len2=w.length();
                for(int j=0;j<len2;j++)
                {
                     char ch2=w.charAt(j);
                     if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
                      nov++;
                }
                if(nov>=maxnov)
                {
                maxnov=nov;
                maxnovw=w;
                }
                
                w="";
                nov=0;
            }
        }
        System.out.println("word with the maximum no. of vowels is "+maxnovw+" , with no. of vowels "+maxnov); 
    }
}
