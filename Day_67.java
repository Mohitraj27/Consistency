// Leetcode Problem 67 Add Binary

//Given two binary strings a and b, return their sum as a binary string.

 

class Day_67 {
   
    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int b1 = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0; 
            //converts the character value of a to integer
            int b2 = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
            //converts the character value of b to integer
            int sum = b1 + b2 + carry;
            //normally addtion of each digit
            carry = (sum == 3 || sum == 2) ? 1 : 0;
            //in binary 1+1=> sum 0 with carry 1 & 1+1+1=> sum 1 with carry 1
            result.append((sum == 1 || sum == 3) ? 1 : 0);
        }
      
        if (carry > 0) result.append(1);
        return result.reverse().toString();
    }
    
}
/*
Sample Test Cases

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/
    