
/*
 * WAP to input the first term of arithmatic progression,difference in each consecutive term,
 * and the no. of terms of series. and return the AP series and the sum of the term of the series
 * 
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:a=d=0
 * STEP 3:IMPORT a,d
 * STEP 4:IMPORT n
 * STEP 5:RETURN (a+(n-1)*d)
 * STEP 6:IMPORT n
 * STEP 7:RETURN (n*(a+nTH_term(n))/2)
 * STEP 8:IMPORT n
 * STEP 9:PRINT SERIES
 * STEP 10:IF i=0;i<=n;i++ GOTO STEP 11
 * STEP 11:PRINT Nth_term(i)+""
 * STEP 12:i++ & IF i<=n GOTO STEP 11
 * STEP 13:PRINT SUM:sum(n)
 * STEP 14:END
 */
import java.util.*;
public class AP_pro1
{
    double a;
    double d;
    double n;
    double Nth_term(double n)
    {
        return (a+(n-1)*d);//to calculate each term of AP
    }
    double Sum(double n)
    {
        return (n*(a+Nth_term(n))/2);//to return the summation of n tems of AP series
    }
    void showSeries(double n)
    {
        System.out.println("series");
        for(int i=1;i<=n;i++)//to generate series 
        {
            System.out.print(Nth_term(i)+", ");
        }
        System.out.println("sum of series is "+Sum(n));
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st term");
        a=sc.nextDouble();
        System.out.println("enter common difference");
        d=sc.nextDouble();
        System.out.println("enter no. of terms");
        n=sc.nextDouble(); 
        Nth_term(n);
        Sum(n);
        showSeries(n);
    }
}
 /* sample output
enter 1st term
2
enter common difference
2
enter no. of terms
5
series
2.0, 4.0, 6.0, 8.0, 10.0, sum of series is 30.0
*/

