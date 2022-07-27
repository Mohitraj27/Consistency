/*
 * A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1.
 * Eg: 85 >> 8+5=13 and factors of 85 is 17,5 so sum of digits of factors i.e. 1+7+5>>13 
 * So, 85 is a Smith no.(sum_of_digits == sum of digits of factors)
 */
import java.util.*;
class Day_38
{//function to find sum of digits of a number
        static int sum_of_digits(int N)
        {int digits=0;
            while(N>0)
            {
                 digits=digits+N%10;
                 //extract last digit from the given no.
                 N=N/10;
            }
            return digits; 
    }
    //Function to extract prime factors of a Number
    static int PrimeFactors(int N)
    { int  sum=0, i=2;
        
        while(N>1)
        {
            if(N%i==0)
            {
                sum+=sum_of_digits(i);
            N/=i;
        }
        else{
            do{
            i++;
        }
        //This while loop will check that the factors which we are extracting in this function
        //are prime or not.
        while(!isPrime(i));
    }}
        return sum;
    }
    //This function will gets called when the factors from functions will be calculated.
    //This function is for checking the factors of a no is prime or not
    static boolean isPrime(int k)
    {
        boolean b=true;
        int d=2;
        while(d<Math.sqrt(k))
        {
            if(k%d==0)
            {
                b=false;
            }
            d++;
            
        }
        return b;
    }
    //Main Method
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int N=sc.nextInt();
        int a=PrimeFactors(N);
        int b=sum_of_digits(N);
        //Compare both the sums
        if(a==b)
        System.out.println("This is a Smith Number");
        else
        System.out.println("This is not a Smith Number");
        }
       
}

/*
 * O/p
Enter your number
85
This is a Smith Number
Enter your number
13
This is a Smith Number
Enter your number
46
This is not a Smith Number
 */