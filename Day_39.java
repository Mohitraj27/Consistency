
//In this program I have Merged two different problems together
//First problem  is of leetcode to reverse a integer for which I've created a 
// seperated a function and 
//second is to check it is a duck no or not.
//Duck number is another special positive non-zero number that contains zero in it. 
//The digit zero should not be presented at the starting of the number. 
//Zero can be present at any of the positions except the beginning of the number. 
import java.util.*;
class Day_39 {
    //This function is of leetcode to reverse a integer
    public static  int reverse(int x) {
    long reversedInteger = 0;
        while(x!=0){
            int unit = x%10;
            reversedInteger = (reversedInteger*10)+unit;
            x/=10;
        }
        if(reversedInteger > Integer.MAX_VALUE || reversedInteger<Integer.MIN_VALUE) 
            return 0;
        return (int)reversedInteger;
    }
    //Function to check It is a duck no or not
   public static boolean IsDuck(int N)
   {
       while(N!=0)
       {  //Extracting each digit of a no to check it 
           // is duck no or not
           if(N%10==0)
           
            return true;
            //to remove last digit of a no.
                N=N/10;
           
       }
       return false;
           
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number");
       int N=sc.nextInt();
       if(IsDuck(N))
       System.out.println("This is a Duck Number:");
       else
       System.out.println("This is not a Duck Number:");
    
   }
}