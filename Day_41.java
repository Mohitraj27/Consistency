//Krishnamurthy no is the no whose sum of factorial of each digits == the number itself.
//Eg: 145>> 1!+4!+5!=1+24+120=145 , its a krishnamurthy number

import java.util.*;
class Day_41
{//function to check the conditin for Krishnamurthy number
    public static boolean isKrishnaMurthy(int number)
    { int sum=0;
        //number is intialized to temporary variable
        int temp=number;
        while(temp!=0)
        {
            //sum of the factorial of the number
            sum+=factorial(temp%10);
            temp/=10;
            
        }//if sum of factorial is equal to the number then its a krishnamurthy number.
        return (sum==number);
    }
    //This function is to calculate the factorial 
    public static int factorial( int number)
    { int fact=1;
        //while loop , number should not be zero
        while(number!=0)
        {
            fact*=number;
            number--;
            
        }
        return fact;
    }
    //Main Method
    public static void main(String args[])
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter your number");
             int number=sc.nextInt();
             if(isKrishnaMurthy(number))
             System.out.println("It is a Krishnamurthy No");
             else
             System.out.println("It is not a Krishnamurthy No");
             
         }
    }
    
    /*
     * Output
     * 
Enter your number
145
It is a Krishnamurthy No
Enter your number
594
It is not a Krishnamurthy No

     */