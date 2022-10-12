//Leetcode Problem 1837. Sum of Digits in Base K
//Problem Statement Given an integer n (in base 10) and a base k,
// return the sum of the digits of n after converting n from base 10 
//to base k.

//After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.

 
class Day_115 {
    public int sumBase(int n, int k) {
        
      int sum = 0;
        while (n != 0){
            sum += n % k;
            n = n / k;
        }
        return sum;

    }
}/*
Output
Example 1:

Input: n = 34, k = 6
Output: 9
Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
Example 2:

Input: n = 10, k = 10
Output: 1
Explanation: n is already in base 10. 1 + 0 = 1.
*/