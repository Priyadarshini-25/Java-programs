
/**
 * Write a description of class pro2_bubbleBinary8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class pro2_bubbleBinary8
{
    int a[];
    int srch;
    void bubble(int[] a,int i,int j)   
    {
        if(i<a.length-1) 
        {
            if(j<a.length-1-i)
            {
                if(a[j+1]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
             bubble(a,i,j+1);
            }
            bubble(a,i+1,0);
        }
    }
    
    int binary(int[] a,int val,int l,int u)
    {
        int mid=(l+u)/2;
        if(l>u)
        return 0;
        else if(a[mid]==val) 
        return 1;
        else if(val<a[mid])
        return binary(a,val,l,mid-1);    
        else if(val>a[mid])    
        return binary(a,val,mid+1,u); 
        return -1; 
    }   
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("enter search element");
        int srch=sc.nextInt();
        pro2_bubbleBinary8 ob=new pro2_bubbleBinary8(); 
        ob.bubble(a,0,0);   
        int ans=ob.binary(a,srch,0,n-1);  
        if(ans==1)
        System.out.println("search successful");
        else
        System.out.println("search unsuccessful");
    }
}
/*
 * enter the no. of elements
5
enter elements
5
2
4
1
3
enter search element
3
search successful

 */
        
        
