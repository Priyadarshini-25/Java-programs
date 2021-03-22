
/**
 * Write a description of class pattern here.
 * St. Xaviers prelims
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern
{
    void hline()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.print("_");
        }
    }
    void hline(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }
    void hline(int n,char c)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(c);
        }
    }
    void main()
    {
        int a=1,c=1;
        char b='A';
        pattern ob=new pattern();
        for(int i=1;i<=5;i++)
        {
            ob.hline(a);
            a+=2;
            System.out.println();
        }
        System.out.println();
        ob.hline();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            ob.hline(c,b);
            c++;
            b++;
            System.out.println();
        }
    }
}
