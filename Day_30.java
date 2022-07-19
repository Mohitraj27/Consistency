//Sunny Number : 
//if the number next to the given number is a perfect square. In other words, 
//a number N will be a sunny number if N+1 is a perfect square.
//N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. 
//Hence 80 is a sunny number.
import java.util.*;
class Day_30
{
 public static boolean isSunnyNo(int num)
 {
     if(Math.sqrt(num+1) %1==0)
     return true;
     else
     return false;
 }
 public static void main(String args[])
 {
     
     Scanner sc=new Scanner(System.in);
     int upper_range=0,lower_range=0;
     
     System.out.print("Enter lower range: ");  
     
     lower_range=sc.nextInt();
    
    System.out.print("Enter upper range: ");  
     
  upper_range=sc.nextInt();
     
  System.out.println("The Sunny number from " +lower_range+"to"+upper_range+"are :");
     
     for(int i=lower_range;i<=upper_range;i++)
     {
         if(isSunnyNo(i))
         System.out.print(i+" ");
     }
     
 }
}

/* Output
Enter lower range: 1
Enter upper range: 100
The Sunny number from 1to100are :
3 8 15 24 35 48 63 80 99 
*/