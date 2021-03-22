
/**
 * Write a description of class wordsAscen_selectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class wordsAscen_selectionSort
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[5];
        System.out.println("enter 5 words/names");
        for(int i=0;i<5;i++)
        {
            names[i]=sc.next();
            names[i]=names[i].toUpperCase();
        }
         System.out.println("\nSorting words/names in alphabetical order...\n");
         for(int i=0;i<5-1;i++)
         {
             int min=i;
             for(int j=i+1;j<5;j++)
             {
                 if(names[j].compareTo(names[min])>=0)
                 min=j;
                }
                String temp=names[i];
                names[i]=names[min];
                names[min]=temp;
            }
         System.out.println("sorted array alphabetically");
         for(int i=0;i<5;i++)
         {
              System.out.println(names[i]);
            }
        }
    }
