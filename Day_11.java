
import java.util.*;
class Day_11
{
    static int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String args[])
    { int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("The factorial of "+ n + " is "+ fact(n));
    }
    
}