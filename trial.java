
/**
 * Write a description of class trial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trial
{
    static void main()
    {
    int x=0;
    char a=65;
    do
    {
        if(x<=4)
        {
            x+=2;
            System.out.println(++x);
            if(a<=0)
            continue;
            --x;
        }
        else
        {
            a+=x;
            System.out.println(a);
            break;
        }
    }while(x<10);
    System.out.println(a+x);
   }
}
    
