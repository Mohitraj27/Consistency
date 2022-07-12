import java.util.*;
class Day_22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int d,rev=0;
        int temp;
        temp=num;
        while(num>0)
        {
            d=num%10;
            rev=(rev*10)+d;
            num=num/10;
           
        }
       if(temp==rev)
       {
           System.out.println(" plaindrome number:");
       }
       else
       System.out.println(" not a plaindrome number:");
    }
}