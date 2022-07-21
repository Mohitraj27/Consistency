//Multiplying a number by two and three separately, 
//the number obtained by writing the results obtained with the given number will be 
//called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
//In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:
//If the given number is a 3 or more than three-digit
//If the value getting after concatenation contains all digits from 1 to 9, exactly once.
/* 
327×2=654

327×3=981
Now, concatenate the above results to the given number (n).

"327"+"654"+ "981"= 327654981
327 is a Fascinating no cause it contains all the digits from 1 to 9.
*/
import java.util.*;
class Day_32
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int num1,num2;
        num1=num*2;
        num2=num*3;
        char c;
       boolean found=true;
        String concatstr=num+" "+num1+num2;
        for( c='1'; c<='9';c++)
        {
            int count =0;
            for(int i=0;i<concatstr.length();i++)
            {
                char ch=concatstr.charAt(i);
                if(ch==c)
                count++;
                
            }
            if(count>1||count==0)
        {
            found=false;
            break;
        }
        }
        if(found)
        System.out.println(num+"is a Fascinating number:");
        else
        System.out.println(num+"is not an Fascinating number:");
        
    }
}
/* 
 * Output
 * Enter your number
327
327is a Fascinating number:
Enter your number
2563
2563is not an Fascinating number:
 */