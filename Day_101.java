//Leetcode Problem 2413 Smallest Even Multiple 
//Given a positive integer n,
// return the smallest positive integer that is a multiple of both 2 and n.
import java.util.*;
class Day_101
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num=sc.nextInt();
        //smallestEvenMultiple(num);
         System.out.println("The smallest multiple of both  "+num +" and 2 is :"+smallestEvenMultiple(num));
        
    }
     public static int smallestEvenMultiple(int n)
        {
          if(n%2==0)
          return n;
          else return n*2;
        }
}

/* Output
 Enter the value of n:
5
The smallest multiple of both  5 and 2 is :10
 */