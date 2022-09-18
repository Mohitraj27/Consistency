//Program that return the largest integer 
//but not larger than base 2 logarithm of a specified integer
import java.util.*;
class Day_92
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("Orginal Number: %d\n",n);
        int shift_right_count =0;
        do{
            n>>=1;
            shift_right_count++;
            
        }
        while(n!=0);
        shift_right_count--;
        System.out.printf("Result: %s\r\n",shift_right_count);
    }
}
//Output
/*
 2350
Orginal Number: 2350
Result: 11
526
Orginal Number: 526
Result: 9
 */