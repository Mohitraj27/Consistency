// Program to find the sum of odd & even numbers from 1 to n
import java.util.*;
class Day_29
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
       int i;
       double x;
        int sum_odd=0,sum_even=0;
        for( i=1;i<=n;i++)
        {   
            if(i%2==0)
            {
                sum_even+=i;
               
            }
             
            else if(i%2!=0)
            { 
                sum_odd+=i;
               
            }
             }
                 System.out.println("The sum of odd numbers from 1 to " + n + " is "+sum_odd);
             
       System.out.println("The sum of even numbers from 1 to " +n+ " is " +sum_even); 
    }
       
    }
    /* Output 
     * Enter the value of n
1000
The sum of odd numbers from 1 to 1000 is 250000
The sum of even numbers from 1 to 1000 is 250500
     */
