//Leetcode Problem 338 Counting Bits
//Given an integer n, return an array ans of length n + 1 such that 
//for each i (0 <= i <= n), ans[i] is the number of 1's in the 
//binary representation of i.

 

class Day_69 {
    public int[] countBits(int n) {
    
    int arr[]=new int[n+1];
for(int i = 0; i <= n; i++)
            arr[i] = arr[i/2] + (i%2==1?1:0);
        return arr;
    }}
    
    //Sample TEst Case
    /*
    Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
     */