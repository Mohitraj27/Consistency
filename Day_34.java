
//Neon Number
/*
 * 9 >> 9*9 >> 81 >> 8+1=9 now 9 is equal the user input number. So 9 is an Neon Number
 * 
 * 10 >> 10*10 >> 100 > 1+0+0=1 so 1 !=  10 ,so 10 is not an Neon number
 */
import java.util.*;
class Day_34
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,num;
        System.out.println("Enter the number to check");
         num = sc.nextInt();
         //calculate square of the given number  
        int square=num*num;
        //loop executes until the condition becomes false  
        while(square!=0)
        {
            //find the last digit of the square 
            int digit=square%10;
            //adds digits to the variable sum  
            sum+=digit;
            //removes the last digit of the variable square 
            square/=10;
        }
        //compares the given number (num) with sum
        if(num == sum)
        System.out.println(num+" is a Neon Number");
        else
        System.out.println(num+" is not a Neon Number");
        
    }
}

/*
 * Algorithm Used
 * 
 * Read an integer from the user or initialize a number (n) to check.
Calculate the square of the given number (n) and store it in variable sq.
Find the sum of the digits of the square (sq) and store the sum in the variable (sum).
Compare the given number n with If both are equal, the given number is a neon number, else, not a neon number.
 */
/*Output  
 * Enter the number to check9
9 is a Neon Number
Enter the number to check10
10 is not a Neon Number
 */