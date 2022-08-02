/*Leetcode Problem 1502 Can Make Arithmetic Progression From Sequence
Problem Statement:
A sequence of numbers is called an arithmetic progression 
if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. 
Otherwise, return false.
*/
 
import java.util.*;
class Day_44 {
    
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        long diff = arr[0]-arr[1];
        for(int i=1; i<arr.length-1; i++){
            long cdiff =(arr[i]- arr[i+1]);
            if(cdiff != diff){
                return false;
            }
        }
        
        return true;
    }
}
//Algorithm Used:
//1. Intially sort all the elements of the array using Arrays.sort
//2. store the diff of first two elements of the array
//3. now, using for loop check the difference  other elements and store it to cdiff
//4. if both difference are equal return true else false.

//Sample Test Cases
/*
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively,
 between each consecutive elements.
 
 
 Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
*/