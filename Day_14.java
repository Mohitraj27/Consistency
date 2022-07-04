
//Fibonacci Series till 10 terms:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
import java.util.*;
class Day_14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for nth series of fibonacci series");
        int n=sc.nextInt();
        System.out.println("The Fibonacci Series for "+n+"terms is"+":");
        int firstterm=0;
        int secondterm=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(firstterm+",");
            int nextTerm= firstterm + secondterm;
            firstterm = secondterm;
            secondterm=nextTerm;
        }
    }
}