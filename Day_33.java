/*Input : x = 197
Output : Yes
197 has 3 digits, so n = 3
The number is Keith because it appears in the special
sequence that has first three terms as 1, 9, 7 and 
remaining terms evaluated using sum of previous 3 terms.
1, 9, 7, 17, 33, 57, 107, 197, .....
1+9>> 17
17+7>> 33 and so on till 197. 
Input : x = 12
Output : No
The number is not Keith because it doesn't appear in
the special sequence generated using its digits.
1, 2, 3, 5, 8, 13, 21,

Algorithm
Store the ‘n’ digits of given number “x” in an array “terms”.
Loop for generating next terms of sequence and adding the previous ‘n’ terms.
Keep storing the next_terms from step 2 in array “terms”.
If the next term becomes equal to x, then x is a Keith number. If next term becomes more than x, then x is not a Keith Number.
 
*/
import java.util.*;
class Day_33
{
    static boolean isKeith(int x)
    {   //Stores all the digits of  a numbr in vector "terms"
        //also find the no of digits and store in n.
        ArrayList <Integer> terms=new ArrayList<Integer>();
        int temp=x,n=0;
        
        while(temp>0)
        {
            terms.add(temp%10);
            temp=temp/10;
            n++;
        }
        //to get the digits in right order from MSB to LSB.
        Collections.reverse(terms);
        
        //Keep finding next terms of a sequence generated using
        //digits of x until we either reach x or a number greater than x
        int next_terms=0,i=n;
        while(next_terms<x)
        {
            next_terms=0;
            for(int j=1;j<=n;j++)
            
            //next term is sum of previous n terms
                next_terms+=terms.get(i-j);
                terms.add(next_terms);
                i++;
            
          
        }
          /* When the control comes out of the while loop,
    either the next_term is equal to the number
    or greater than it.
    If next_term is equal to x, then x is a
    Keith number, else not */
          return (next_terms == x);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        if(isKeith(num))
       System.out.println("Yes its a Keith number");
        else
       System.out.println("No its not a Keith number");
    }
}