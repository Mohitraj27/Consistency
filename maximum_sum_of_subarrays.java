/*
 To find the maximum sum of all subarrays of size K:
Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}, k = 2
Output : 700
[1,5,4,2,9,9,9]

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.


Input  : arr[] = {2, 3}, k = 3
Output : Invalid
There is no subarray of size 3 as size of whole array is 2.
  Brute-Force Approach O(N^2)

 */
import java.util.*;
class maximum_sum_of_subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter size of subarray (k): ");
        int k = sc.nextInt();
 
       int result = maxSumSubArrays(arr,n,k);
          if (result == Integer.MIN_VALUE) {
            System.out.print("Invalid");
        } else {
            System.out.print(result+"  is the maximum sum of SubArray ");
        }
        sc.close();
    }
    public static int maxSumSubArrays(int arr[],int n,int k){
        if(k>n){
            return Integer.MIN_VALUE;
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
             max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
}