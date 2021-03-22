
/*WAP to take input of an array and the element to search in it 
 * and display whether search is successful or not,
 * if successful display its position in th sorted descended array
 * 
 * ALGORITHM-
 * STEP 1:START
 * STEP 2:TAKE INPUT OF THE NO. OF ELEMENTS TO BE INPUTED BY USER,AND STORE IT IN size
 * STEP 3:INITIALZE AN INTEGER ARRAY OF SIZE size
 * STEP 4:RUN A FOR LOOP AND TAKE INPUTS OF THE ARRAY ELEMENTS FROM USER
 * STEP 5:SORT THE ARRAY USING BUBBLE SORT TECHNIQUE,IN DESCENDING ORDER
 * STEP 6:DISPLAY SORTED ARRAY
 * STEP 7:TAKE INPUT OF THE ELEMENT TO BE SEARCHED FROM THE USER
 * STEP 8:INITIALIZE bg to 0,end to size-1,mid to 0 and flag to 0
 * STEP 8:RUN A WHILE LOOP TILL beg<=end
 * STEP 8.1:CALCULATE mid=(beg+end)/2
 * STEP 8.1.1:IF SEARCH ELEMENT IS PRESENT ON THE LEFT SIDE OF THE MID ELEMENT THEN end =mid-1
 * STEP 8.1.2:ELSE IF SEARCH ELEMENT IS PRESENT ON THE RIGHTSIDE OF THE MID ELEMENT THEN beg=mid+1
 * STEP 8.1.3:ELSE IF SEARCH ELEMENT IS PRESENT ON THE MID ELEMENT,THEN flag=1 AND break
 * STEP 9:IF flag==1 THEN PRINT("element found at "+(mid+1)+" position")
 * STEP 10:ELSE PRINT("search element not found")
 * STEP 11:END
 */
import java.util.*;
public class binarySearch_descenSort_pro7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements to be inputed");
        int size=sc.nextInt();
        int n[]=new int[size]; 
        System.out.println("enter array elements");
        
        for(int i=0;i<size;i++)
        n[i]=sc.nextInt();
        
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(n[j]<n[j+1])
                {
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<size;i++)
        System.out.print(n[i]+",");
        
        System.out.println("enter array element to be searched");
        int srch=sc.nextInt();
        int beg=0,end=size-1,mid=0,flag=0;
        while(beg<=end) 
        {
            mid=(beg+end)/2;
            if(srch>n[mid])
            end=mid-1;
            else if(srch<n[mid]) 
            beg=mid+1;
            else if(srch==n[mid])
            {
                flag++; 
                break;
            }
        }
        if(flag==1)
        System.out.println("element found at "+(mid+1)+" position");
        else
        System.out.println("search element not found");
    }
}
/*
 enter no. of elements to be inputed
5
enter array elements
5
2
3
1
4
sorted array
5,4,3,2,1,enter array element to be searched
1
element found at 5 position
 */
 
