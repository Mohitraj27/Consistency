//Check whether a given number is a ugly number or not
import java.util.*;
class Day_106
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a integer");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println("Input a correct integer:");
        }
        int x=0;
        while(num!=1)
        {
            if(num%5==0)
            {
                num/=5;
            }
            else if(num%2==0)
            {
                num/=2;
            }
            else
            {
                System.out.print("It is not an ugly number:");
                x=1;
                break;
            }
        }
        if(x==0)
        System.out.print("It is an ugly number:");
        System.out.print("\n");
    }
}

/*
 Input a integer
546
It is not an ugly number:
Input a integer
-1
Input a correct integer:
It is not an ugly number:
 */