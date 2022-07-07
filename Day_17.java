//Sum of digits using recursion 
import java.util.*;
class Day_17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int  num=sc.nextInt();
       System.out.println("sum of digits of "+num+"is"+sum(num));
    }
    public static int sum(int num)
    {
        //Ternary Operator is used for checking the sum of digits.
        return num==0 ? 0 : num%10+sum(num/10);
    }
}