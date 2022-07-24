/*
 * A positive integer is called a spy number if the sum and product of its digits are equal. 
 * In other words, a number whose sum and product of all digits are equal is called a spy number.
 * Eg: 231>> 2+3+1=6 and 2*3*1 =6 so 231 is a Spy number.
 */

import java.util.*;
class Day_35
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int sum=0,product=1;
        while(num>0)
        {
            int digits=num%10;
            sum+=digits;
            num/=10;
            product*=digits;
        }
        if(sum == product)
        System.out.println("This is a Spy Number");
        else
        System.out.println("This is not a Spy Number");
    }
}
/*
 * 
 Output
Enter your number
231
This  is a Spy Number
Enter your number
217
This  is not a Spy Number
Enter your number
201
This is not a Spy Number
*/