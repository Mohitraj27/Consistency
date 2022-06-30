//Code to check whether it is a perfect number or not.
//Perfect number is a number whose sum of divisors is equal to the Number.
//Excluding that number For eg: 6 -> 3,2,1 -> 3+2+1 = 6 so 6 is a Perfect number.

import java.util.*;
class Day_10
{
    static boolean isPerfect(int n)
    {
        if(n==1)
        return false;
    int sum=1;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
        
    }
    if(sum ==n)
    return true;
    return false;
    }
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number to check whether it is a Perfect no. or not ");
        int n=sc.nextInt();
        if(isPerfect(n))
        System.out.println(n+" is a Perfect number");
        else
        System.out.println(n+" is not a Perfect Number");
    }
}