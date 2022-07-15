// Program for sum of Natural numbers till n 
import java.util.*;
class Day_26
{
    static int Natural_sum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        
            sum+=i;
            return sum;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The sum of Natural numbers till " + num + " is "+ Natural_sum(num));
    }
}

/*
 * 100
The sum of Natural numbers till 100 is 5050
 */