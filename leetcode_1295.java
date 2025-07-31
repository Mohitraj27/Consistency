/**
 * 1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.

 
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 */

 import java.util.*;
 class leetcode_1295{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        int result = findNumbers(nums);
        if(result == 0){
            System.out.println("No numbers with even digits found.");
        } else {
            System.out.println("Count of numbers with even digits: " + result);
    }
}
public static int findNumbers(int[] nums){
    if(nums.length==0){
        return 0;
    }
    int count = 0;
    for(int num:nums){
        int digits = 0;
        while(num != 0){
            num /= 10;
            digits++;
        }
        if(digits % 2 == 0){
            count++;
        }
    }
    return count;

}
}