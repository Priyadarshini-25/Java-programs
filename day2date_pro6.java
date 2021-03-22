
/*WAP to take input of a day no. and an year,and display it in time format
 * example=>
 * input day no.
 * 366
 * input yr
 * 2016
 * output
 * 31st dec,2016
 * 
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:INITIALIZE a[],m[]
 * STEP 3:INPUT n,yr
 * STEP 4:IF(yr%4==0)THEN a[1]=29
 * STEP 5:INITIALIZE t=0 and s=0
 * STEP 6:IF(t<n)REPEAT STEP 7
 * STEP 7:t=t+a[s++]
 * STEP 8:d=n+a[--s]-t
 * STEP 9:IF(d==1||d==21||d==31)THEN PRINT(d+"st"+m[s]+","+yr)
 * STEP 10:IF(d==2||d==22)THEN PRINT(d+"nd"+m[s]+","+yr)
 * STEP 11:IF(d==3||d==23)THEN PRINT(d+"rd"+m[s]+","+yr)
 * STEP 12:PEINT(d+"th"+m[s]+","+yr)
 * STEP 13:END
 * 
 */
import java.util.*;
public class day2date_pro6
{
    public void cal(int n,int yr)
    {
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};  
        if(yr%4==0)
        a[1]=29;
        int t=0,s=0;
        while(t<n)
        {
            t=t+a[s++];
        }
        int d=n+a[--s]-t;
        if(d==1||d==21||d==31)
        System.out.println(d+"st"+m[s]+","+yr);
        else if(d==2||d==22)
        System.out.println(d+"nd"+m[s]+","+yr);
        else if(d==3||d==23)
        System.out.println(d+"rd"+m[s]+","+yr);
        else
        System.out.println(d+"th"+m[s]+","+yr);
    }
    public static void main()
    {
        day2date_pro6 ob=new day2date_pro6();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day no.");
        int n=sc.nextInt();
        while(true)
        {
            if(n>=1&&n<=366)
            break;
            else
            {
            System.out.println("enter correct day number 1-366");
            n=sc.nextInt();
            }
        }
       System.out.println("enter year");
       int yr=sc.nextInt();
       while(true)
       {
           if((n==366&&yr%4!=0)||(n!=366&&yr%4==0)) 
           {
               System.out.println("enter correct year no.");
               yr=sc.nextInt();
            }
            else
            break;
        }
       ob.cal(n,yr);
    }
}
/*enter day no.
5555
enter correct day number 1-366
-9
enter correct day number 1-366
366
enter year
2015
enter correct year no.
2017
enter correct year no.
2016
31stDEC,2016
*/