//Program to check number is cyclic or not
import java.util.*;
import java.math.BigInteger;
class Day_122
{
    
      public static void main( String args[] ){ 
            Scanner sc = new Scanner( System.in ); 
            System.out.print("Input a number: "); 
            String strnum = sc.nextLine().trim();
            BigInteger n = new BigInteger(strnum);
            int len = strnum.length()+1;
            String str = String.valueOf(len);
            BigInteger n1 = new BigInteger(str);
            StringBuilder buf = new StringBuilder();
            for(int i = 0 ; i < (len-1); i++) {
                buf.append('9');
            }
            BigInteger total = new BigInteger(buf.toString());
            if(n.multiply(n1).equals(total)) {
                System.out.println("It is a cyclic number.");
            }
            else {
                System.out.println("Not a cyclic number.");
            }                    
        }
    }
    /*
     Output
     Input a number: 142857
     It is a cyclic number.
     Input a number: 142557
     Not a cyclic number.
     */
