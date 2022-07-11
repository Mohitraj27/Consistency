//Random Numbers returns a Psuedorandom double that is greater than equal to 0.0 & less than 1.0
//This Program allows the user to enter the lower limit and upper limit for the random number
/*Output
Enter your range
1
10000
Random value b/w 1 to 10000 is 1417

*/
import java.util.*;
class Day_21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your range");
        // change the data type  to float/double as per the requirement.
        int lower_limit=sc.nextInt();
        int upper_limit=sc.nextInt();
        System.out.print("Random value b/w " + lower_limit+ " to "+ upper_limit + " is " );
        
        int z=(int)(Math.random()*(upper_limit-lower_limit+1)+lower_limit);
        System.out.println(z);
    }
}