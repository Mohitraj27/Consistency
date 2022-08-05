/*Leetcode Problem 231
Problem Statement: Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

class Day_47 {
    public boolean isPowerOfTwo(int n) {
       
        if(n==1)
            return true;
        else if(n==0||n%2!=0)
        {       return false;
    }
         return isPowerOfTwo(n/2);
    }
}

/*
 * Sample Test Cases
 * 
 Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 * 
 */