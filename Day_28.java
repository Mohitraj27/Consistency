//Peterson No is sum of factorials of each digit is equal to the 
// sum of no. itself.
import java.util.*;
class Day_28
{
   public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
       System.out.println("Enter your no");
       int num=sc.nextInt();
       int temp=num;
       int sum=0,fact=1;
       while(num>0)
       {  
           fact=1;
           //variable d is for extracting each digits and storing.
           int d= num%10;
           //for loop for extracting factorial of each digits
           for(int i=1;i<=d;i++)
           {
               fact*=i;
           }
           
           num=num/10;
           //taking the sum of each factorial digits.
           sum+=fact;
       }
       if(sum == temp)
       {
           System.out.println("Peterson no");
           
       }
       else
       System.out.println("Not a Peterson no");
   }
}
/* Output
Enter your no
145
Peterson no
Enter your no
343
Not a Peterson no
*/