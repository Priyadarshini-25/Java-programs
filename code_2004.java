
/**
 * Write a description of class code_2004 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class code_2004
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter encoded message");
        String code=sc.nextLine();
        code=code.trim();
        int l=code.length();
        if(l>200)
        {
            System.out.println("invalid entry");
            System.exit(0);
        }
        else
        {
            String nw="";
            String rev="";
            for(int i=0;i<l;i++)
            {
                char ch=code.charAt(i);
                rev=ch+rev;
            }
            for(int i=0;i<l;i+=2)
            {
                String w=rev.substring(i,i+2); 
                int num=Integer.valueOf(w);
                if(num<32)
                num=num*10+(rev.charAt(i+2)-48);
                nw=nw+(char)num;
            }
            System.out.println(nw);
        }
    }
}
          
