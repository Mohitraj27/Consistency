
//Program to check Automorphic number.
//Automorphic number is such a number whose  square of a given no ends with the same no.
//Example square of 76 is 5776 square ends with the number itself.

import java.util.*;
class Day_27
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        //Counter variable
        int count=0;
        //for the square of numbers
        int square = num * num;
            int temp=num;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int Last_Digit=(int)(square % (Math.pow(10,count)));
        if(num == Last_Digit)
        
            System.out.println(num + " is an automorphic number");
        else 
        System.out.println(num + " is not an automorphic number");
        
        }
    }
/*
 * Output 
 * Enter your number
76
76 is an automorphic number
Enter your number
23
23 is not an automorphic number
 */
