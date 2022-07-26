/*
 * Emirp number: A no which is prime and whose reverse number is also prime 
 * Eg: 13 is prime and 31 is also a prime no , so 13 is Emirp number.
 */

import java.util.*;
class Day_37
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int Num=sc.nextInt();
        //Counter variable
        int count=0;
        //for loop to check whether the no is prime or not
        for(int i=1;i<=Num;i++)
        {
            if(Num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {int digit;
            int temp=Num;
            int rev_num=0;
            //Now after checking num is prime we will reverse the number
            // using this plaindrome no logic
            while(temp!=0)
            {
                 digit=temp%10;
                temp=temp/10;
                rev_num=rev_num*10+digit;
            }
            int count2=0;
            //after reversing the no, that rev_num is checked that 
            //it is prime or not using the below logic
            for(int i=1;i<=rev_num;i++)
            {
                if(rev_num%i==0)
                {
                    count2++;
                }
            }
            //If rev_num becomes prime then count2 increases by 1 
            //below if condition works.
            if(count2 == 2)
            
                System.out.println(" Emirp Number ");
            else
                System.out.println(" Not an Emirp Number ");
            }
        //this else condition returns when at first user input no is not prime
        //eg. 24(user input) not a prime no so this else condition will work.
        //and that no will not proceeds further and moves out of the for loop 
        //prints the below result.
            else
        
            System.out.println("Not an Emirp Number");
        }
    }
    /*
     * Output
Enter your number:
17
 Emirp Number 
Enter your number:
36
Not an Emirp Number

     */
