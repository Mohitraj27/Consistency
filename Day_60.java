// Leetcode Problem 50
//Problem Statement
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 
class Day_60 {
   
    public double myPow(double x, int n) {

      double  result=Math.pow(x,n);
        return result;
    
    }

}
//Sample Test Cases
/*
 Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */