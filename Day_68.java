/* Leetcode Problem 70 Climbing Stair
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Concept of fibonaaci Series is Used
 */
class Day_68 {
    public int climbStairs(int n) {
        
      int nextTerm=0;
      // Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the value for nth series of fibonacci series");
       // int n=sc.nextInt();
        //System.out.println("The Fibonacci Series for "+n+"terms is"+":");
        int firstterm=0;
        int secondterm=1;
        for(int i=1;i<=n;i++)
        {
            //System.out.print(firstterm+",");
              nextTerm= firstterm + secondterm;
            firstterm = secondterm;
            secondterm=nextTerm;
        }
        return nextTerm;
    }}
    
    /*
 Sample Test Cases

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 
     */

