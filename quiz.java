
/**
 * Write a description of class neon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class quiz
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you wish to start the quiz?!(yes/no)");
        String res=sc.nextLine();
        int correct=0,wrong=0;
        if(res.equalsIgnoreCase("no"))
        {
            System.out.println("LOL!");
            System.exit(0);
        }
        else
        {
            
        System.out.println("Q1 WHO IS THE PRESIDENT OF THE UNITED STATES OF AMERICA?");
        System.out.println("1. HILLARY CLINTON");
        System.out.println("2. BARACK OBAMA");
        System.out.println("3. DONALD TRUMP");
        System.out.println("4. JOHN F. KENNEDY");
        System.out.println("ENTER ANSWER....1/2/3/4");
        int ch=sc.nextInt();
        if(ch==1||ch==2||ch==4)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==3)
        {
            System.out.println("CORRECT!");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO NEXT QUESTION");
        
        System.out.println("Q2 TO WHOM DID DONALD TRUMP SAY,"+"SHE IS NO LONGER A 10"+".?");
        System.out.println("1. NICOLE SHERZINGER");
        System.out.println("2. GIGI HADID");
        System.out.println("3. KATE MOSS");
        System.out.println("4. HEIDI KLUM");
        System.out.println("ENTER ANSWER....1/2/3/4");
        ch=sc.nextInt();
        if(ch==1||ch==2||ch==3)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==4)
        {
            System.out.println("CORRECT!");
            correct++;
        }
        System.out.println("Q3 WHICH PART OF PAKISTAN IS DEMANDING ITS INDEPENDENCE AND INDIA IS SUPPORTING IT?");
        System.out.println("1. ISLAMABAD");
        System.out.println("2. BALUCHISTAN");
        System.out.println("3. KUWAIT");
        System.out.println("4. ABBOTTABAD");
        System.out.println("ENTER ANSWER....1/2/3/4");
        ch=sc.nextInt();
        if(ch==1||ch==3||ch==4)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==2)
        {
            System.out.println("CORRECT");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO NEXT QUESTION");
        
        System.out.println("Q4 BY WHOM WAS THE BOOK 'THE ODESSA FILE' WRITTEN?");
        System.out.println("1. JOHN GRISHAM");
        System.out.println("2. FREDRICK FORESYTH");
        System.out.println("3. DAN BROWN");
        System.out.println("4. JOHN GREEN");
        System.out.println("ENTER ANSWER....1/2/3/4");
        ch=sc.nextInt();
        if(ch==1||ch==3||ch==4)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==2)
        {
            System.out.println("CORRECT");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO NEXT QUESTION");
        
        System.out.println("Q5 WHAT IS THE POWERHOUSE OF THE CELL?");
        System.out.println("1. MITOCHONDRIA");
        System.out.println("2. NUCLEUS");
        System.out.println("3. DNA");
        System.out.println("4. CYTOPLASM");
        System.out.println("ENTER ANSWER....1/2/3/4");
        ch=sc.nextInt();
        if(ch==2||ch==3||ch==4)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==1)
        {
            System.out.println("CORRECT");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO THE NEXT QUESTI0N");
        
        System.out.println("Q6 WHO IS THE OLDEST VICTORIA'S SECRET ANGEL?");
        System.out.println("1. ALESSANDRA AMBROSIO");
        System.out.println("2. CARA DELEVINGNE");
        System.out.println("3. BEHATI PRINSLOO");
        System.out.println("4. ADRIANA LIMA");
        System.out.println("ENTER ANSWER....1/2/3/4");
        ch=sc.nextInt();
        if(ch==1||ch==2||ch==3)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==4)
        {
            System.out.println("CORRECT");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO THE NEXT QUESTION");
        
        
        
        System.out.println("Q7 WHAT IS THE ECONOMIC CAPITAL OF INDIA?");
        System.out.println("1. DELHI");
        System.out.println("2. KERALA");
        System.out.println("3. VISHAKAPATNAM");
        System.out.println("4. MUMBAI");
        System.out.println("ENTER ANSWER...1/2/3/4");
        ch=sc.nextInt(); 
        if(ch==1||ch==2||ch==3)
        {
            System.out.println("INCORRECT");
            wrong++;
        }
        else if(ch==4)
        {
            System.out.println("CORRECT");
            correct++;
        }
        else
        System.out.println("CHOICE DOES NOT EXIST....GOING ON TO THE NEXT QUESTION");
        
        System.out.println("Q7 ");
    }
}
}

        
