
/**
 * BANK PROGRAM
 * ATM MACHINE
 */
import java.util.*;
public class test_bank 
{
    public  void main()
    {
        
        Scanner sc=new Scanner(System.in);
        int pos=0;//to store the psition in which the account no. entered by the customer is matching with the stored databae of account no.'s
        int flag=0;//to indicate whether the account no. enteres by the customer on entering the ATM is matching with the database stored
        int acc=0;//to store the account no. of the customer when he/she enters the ATM
        String response1="";//to check whether the customer wants to view the options or not
        String response2="";//to indicate whether any customer is left out,in case any customer wants to check his bank details after one or two customers
        char ch='\u0000';//to store the choice of the customer
         
        String name[]={"Priyadarshini Acharjee","Anupria Banerjee","Tiyasha Biswas","Drishti Desai","Shreya Das","Shamikkha Debnath","Nayanika Roy Chowdhury","Divya Sreshtha","Kaushiki Chowdhari","Ausmita Roy"};//to store 10 names of customers
        int acct_no[]={401601,401602,401603,401604,401605,401606,401607,401608,401609,401610};//to store account no.'s of customers
        double balance[]={15000,40000,1200,6600,45000,5490,12000,34000,98000,10000};//to store balance's of customers  
        
        //database stored  end of for
        
        
        for(;;)
        {
            System.out.println("WELCOME TO ATM!"); 

            System.out.println("enter your account no.[first four no.'s constant i.e. 4016 last two digits your personal no.]"); 
            acc=sc.nextInt();
            
            
            for(int j=0;j<10;j++)
            {
                if(acc==acct_no[j])
                {
                    flag++;
                    pos=j;
                    break;
                }//if
            }//checking for the customer's account no. in the database      end of inner j loop
            
            
            if(flag==0||isValid(acc)==false)
            {
            System.out.println("account no. either not found or is invalid,going on to next customer");
            
            continue;
            }//if
            
            else
            {
                while(true)//if customer wants to check other options
                {
                    System.out.println("welcome "+name[pos]+" !");
                    System.out.println("enter D for deposit");
                    System.out.println("enter W for withdrawal");
                    System.out.println("enter B for balance enquiry");
                    System.out.println("enter E for exit");
                    System.out.println("enter your choice");
                    ch=sc.next().charAt(0); 
                    
                    
                    switch(ch)
                    {
                        case 'D':
                        case 'd':System.out.println("enter amount to be deposited"); 
                                 double deposit=sc.nextLong();
                                 balance[pos]+=deposit;
                                 System.out.println("amount deposited");
                                 break;
                                 
                                 
                        case 'W':
                        case 'w':System.out.println("enter amount to be withdrawn");
                                 double withdraw=sc.nextLong();
                                 if((balance[pos]-withdraw)>=1000)
                                 {
                                     balance[pos]-=withdraw;
                                     System.out.println("transaction successful");
                                 }//if
                                 else
                                 System.out.println("transaction denied,as minimum balance is dropping below 1000");
                                 break;
                                 
                        
                        case 'B':
                        case 'b':System.out.println("actual balance is Rs. "+balance[pos]);
                                 double avai_bal=balance[pos]-1000;
                                 System.out.println("available balance is Rs. "+avai_bal);
                                 break;
                                 
                                 
                        case 'E':
                        case 'e':System.out.println("interaction terminated");
                                 System.exit(0);
                                 
                                 
                        default:System.out.println("WRONG CHOICE!");
                    }//switch
                    
                    System.out.println("do you wish to continue?(yes/no)");
                    response1=sc.next(); 
                    
                    if(response1.equalsIgnoreCase("no"))
                    break;
                    else
                    continue;
                }//while
                
                System.out.println("name= "+name[pos]);
                System.out.println("account no.= "+acc);
                System.out.println("present balance= "+balance[pos]);
                System.out.println("Thank You!  Vist Again!");
                
                pos=0;
                flag=0;
            }//else
            
            System.out.println("is any customer left?(yes/no)");
            response2=sc.next();
           
            
            if(response2.equalsIgnoreCase("no"))
            {
                System.out.println("Thank you customers!Please visit again");
                break;
            }//if
            else
            {
                
             System.out.println('\f'); 
             continue;
            }//else
        }//for
    }//void main

    
    
    boolean isValid(int n)//to check whether the account no. entered by the customer is valid or not
    {
        int c=0,copy=n;
        while(n>0)
        {
            c++;
            n/=10;
        }
        String str=Integer.toString(copy);
        String first_4=str.substring(0,4);
        String last_2=str.substring(4);
        
        if(c==6&&(first_4.equals("4016"))&&(last_2.equals("01")||last_2.equals("02")||last_2.equals("03")||last_2.equals("04")||last_2.equals("05")||last_2.equals("06")||last_2.equals("07")||last_2.equals("08")||last_2.equals("09")||last_2.equals("10")))
        return true;
        return false;
    }//isValid
}//class



/*
 * SAMPLE OUTPUT
 enter your account no.[first four no.'s constant i.e. 4016 last two digits your personal no.]
401609
welcome Kaushiki Chowdhari !
enter D for deposit
enter W for withdrawal
enter B for balance enquiry
enter E for exit
enter your choice
d
enter amount to be deposited
200
amount deposited
do you wish to continue?(yes/no)
yes
welcome Kaushiki Chowdhari !
enter D for deposit
enter W for withdrawal
enter B for balance enquiry
enter E for exit
enter your choice
w
enter amount to be withdrawn
5000
transaction successful
do you wish to continue?(yes/no)
yes
welcome Kaushiki Chowdhari !
enter D for deposit
enter W for withdrawal
enter B for balance enquiry
enter E for exit
enter your choice
b
actual balance is Rs. 93200.0
available balance is Rs. 92200.0
do you wish to continue?(yes/no)
no
name= Kaushiki Chowdhari
account no.= 401609
present balance= 93200.0
Thank You!  Vist Again!
is any customer left?(yes/no)
*/ 