
/*
 * WAP to check whether the inputed no. is a smith no. or not
 * Smith no.=>  the sum of the digits of the no.=the sum of the individual digits of the no's prime factors
 * example=>825 is a smith no.
 * 8+2+5=3+5+5+1+1=15
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:INPUT THE NO.
 * STEP 3:STORE COPY/BACKUP OF THE INPUTED NO. IN A VARIABLE
 * STEP 4:INITIALIZE i,n,num,k,sum1,sum2,digit,a[] to 0
 * STEP 5:FIND SUM OF DIGITS
 * STEP 6:FIND PRIME FACTORS OF NUMBER AND INITIALIZE THEM TO ARRAY
 * STEP 7:FIND THE SUM OF ALL DIGITS OF ALL PRIME FACTORS OF THE NO. AND STORE IT IN ANOTHER VARIABLE
 * STEP 8:CHECK WHETHER THE TWO SEPERATELY CALCULATED SUMS ARE EQUAL OR NOT
 * STEP 9:IF EQUAL PRINT("SMITH NO.")
 * STEP 10:ELSE PRINT("NOT SMITH NO.");
 * STEP 11:END
 * 
 */
import java.util.Scanner;
public class smith_pro2
{
 public static void main(String args[])

 {
  int i, n, num;
  int a[] = new int[100];

  int k = 0, sum1 = 0, sum2 = 0;
  int digit;

  Scanner in = new Scanner(System.in);
  System.out.println("\nEnter a number: ");

  n = in.nextInt();
  num = n;
  while (num != 0)//to find sum of digits of the number inputed
   {
   digit = num % 10;
   sum1 += digit;
   num /= 10;
   }
  num = n;
  for (i = 2; i < n; i++)//to find factors of the inputed number
  {
   while (num % i == 0)//to store each digit of the factors into array
   {
    a[k] = i;
    k++;
    num /= i;
   }

  }
  System.out.println("Prime Factorisation");
  for (i = 0; i < k; i++)//k is the number of elements stored in array
   System.out.print(a[i] + " ");
  for (i = 0; i < k; i++) 
  {
   while (a[i] != 0)//for summation of the digits of the prime factors of the number
   {
    digit = a[i] % 10;
    sum2 += digit;
    a[i] /= 10;
   }
  }
  System.out.println("\nSum of digits of the number: " + sum1);
  System.out.println("\nSum of digits of the prime factors: " + sum2);
  if (sum1 == sum2)
   System.out.println("It is a Smith Number.");
  else
   System.out.println("It is not a Smith Number.");

 }
}
/*
 * sample output
Enter a number: 
825
Prime Factorisation
3 5 5 11 
Sum of digits of the number: 15

Sum of digits of the prime factors: 15
It is a Smith Number.
Enter a number: 
825
Prime Factorisation
3 5 5 11 
Sum of digits of the number: 15

Sum of digits of the prime factors: 15
It is a Smith Number.
*/

