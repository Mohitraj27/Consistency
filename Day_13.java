
/*
 * Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
12 + 92=82
82 + 22=68
62 + 82=100
12 + 02 + 02=1
*/
import java.util.*;
class Day_13
{
    static boolean  isHappy(int num)
    { // 1 & 7 are the only single digit happy numbers.
        if(num==1 || num==7)
        return true;
        int sum = num,x=num;
        //while loop for two digit numbers
        while(sum>9)
        {
            sum=0;
            while(x>0)
            {
                int d=x%10;
                sum+=d*d;
                x/=10;
            }
            if(sum ==1)
            return true;
            x=sum;
        }
        if(sum==7)
        return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isHappy(num))
        System.out.println(num+" is a Happy number");
        else
        System.out.println(num+" is not a Happy number");
        
        }
}