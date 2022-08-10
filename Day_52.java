/*
Leetcode Problem 342. Power of Four 
Problem Statement Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.
*/
 
class Day_52 {
    public boolean isPowerOfFour(int n) {
       if(n==0)
           return false;
         if(n==1)
          return true;
        if(n%4!=0)
            return false;
        else return isPowerOfFour(n/4);
    }
}
/*Sample Test Cases
Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
*/