
/**
 * Write a description of class pro here.
   Write a program that encodes a word into Piglatin. To translate a word into a Piglatin word, convert the word into uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets. The alphabets present before the vowel being shifted towards the end followed by “AY”.
Sample Input (1) : London, Sample Output (1) : ONDONLAY
Sample Input (2) : Olympics, Sample Output (2) : OLYMPICSAY
 */
 import java.util.*;
 class pro2_piglatinRecur7
 {
     String s;
     String w="";
     void word(String s,int i)
     {
         if(i<s.length())
         {
             char ch=s.charAt(i);
             if(ch!=' ')
             w=w+ch; 
             else
             {
                 piglatin(w);
                 w="";
                }
                word(s,i+1);
            }
        }
        
        void piglatin(String s)
        {
            int p=0;
            for(int k=0;k<s.length();k++) 
            {
                char ch=s.charAt(k);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    p=k;
                    break;
                }
            }
            String a=s.substring(p);
            String b=s.substring(0,p);
            String piggy=a+b+"ay";
            System.out.println(piggy+" ");
        }
        
        void display()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter any sentence");
            s=sc.nextLine(); 
            s=s+" ";
            System.out.println("output is ");
            word(s,0);
        }
        public static void main()
        {
            pro2_piglatinRecur7 ob=new pro2_piglatinRecur7();
            ob.display();
        }
    }
    /*
     * enter any sentence
       trouble
       output is 
       oubletray 

     */
            
