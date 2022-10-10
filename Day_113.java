/*Write a Java program to find the length of the longest sequence of zeros in binary representation of an integer.

Sample example:
Number 7 has binary representation 111 and has no binary gaps.
Number 8 has binary representation 1000 and contains a binary gap of length 0.
Number 457 has binary representation 111001001 and contains a binary gap of length 2.
Number 40 has binary representation 101000 and contains one binary gap of length 1.
Number 12546 has binary representation 11000100000010 and contains highest binary gap of length 6.
*/
import java.util.Scanner;
import java.lang.Math;
class Day_113
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        //Intializing the size for binary integer
        int binary_integr[]=new int[n];
        
        
        System.out.println("Input a Decimal No:");
        
        int decimal_digit = sc.nextInt();
        int i=1;
        //storing the user input digit to temp variable
         int temp=decimal_digit;
         //conversion of decimal digit to binary form
        while(temp !=0)
        {
            binary_integr[i++]=temp%2;
            temp/=2;
            
        }
        String binary_string="";
        //System.out.println();
        //converting the extracted binary integer into binary string form
        // to count the longest binary gaps of zero
        for(int j=i-1;j>0;j--)
    {
        binary_string +=binary_integr[j];
    }
        System.out.println(" Binary_string is: "+binary_string);
        i=binary_string.length()-1;
        //checking the occurence of zeros in each character of binary string
        while(binary_string.charAt(i)=='0')
        {
            i--;
        }
       int length=0;
       int counter=0;
       //now counting the length of longest sequence pf zeros in binary integer
       for(;i>=0;i--)
       {
           if(binary_string.charAt(i)=='1')
           {
               length=Math.max(length,counter);
               counter=0;
               
           }
           else{
               counter++;
           }
       }
       //among differnet occurence of  zero in binary string we'll take the longest sequence 
       //of binary gaps so  used Math.max
       
       length=Math.max(length,counter);
       System.out.println("length of the longest sequence : "+length);
    }
}
/* Output of the Program
 Input a Decimal No:
7
 Binary_string is: 111
length of the longest sequence : 0

Enter the size of the array: 
100
Input a Decimal No:
40
 Binary_string is: 101000
length of the longest sequence : 1

 */