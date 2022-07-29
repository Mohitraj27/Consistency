/*
 * An ISBN (International Standard Book Number) is a 10 digit number that is used to identify a book.
The first nine digits of the ISBN number are used to represent the Title, Publisher and Group of the book and the last digit 
is used for checking whether ISBN is correct or not.
The first 9 digits of it, can take any value between 0 and 9, but the last digits, sometimes may take value equal to 10; 
this is done by writing it as ‘X’.
To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, 
plus 8 times the third digit and so on until we add 1 time the last digit. 
If the final number leaves no remainder when divided by 11,
 the code is a valid ISBN.
*/
import java.util.*;
class Day_40
{
   public static boolean isISBN(String isbn)
    {   
        //checking the length of ISBN No. it should be 10.
        int len=isbn.length();
        if(len!=10)
        
            return false;
            int sum=0;
            for(int i=0;i<9;i++)
            { //Extracting each digits from a ISBN Number
                int digit=isbn.charAt(i) - '0';
                if(0>digit || 9<digit)
                   return false;
                    sum+=(digit*(10-i));
                
            }
            //checking last digit
            char last=isbn.charAt(9);
            
            if(last!='X' && (last<'0' || last>'9'))
            return false;
            
            //If last digit is X, add 10 to sum,else add its value
            sum+=((last == 'X')?10:(last-'0'));
            
            //Return true if weighted sum of digits is divisible by 11
            return (sum%11==0);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ISBN No. to check its Validity");
        String isbn=sc.next();
        if(isISBN(isbn))
        System.out.print("Valid");
        else
        System.out.print("Invalid");
        
    }
}

/* Output
 * Enter your ISBN No. to check its Validity
123561945Z
Invalid
Enter your ISBN No. to check its Validity
007462542X
Valid
 */