/*
 * Sort 0s, 1s and 2s
Difficulty: MediumAccuracy: 50.58%Submissions: 794K+Points: 4Average Time: 10m
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 2
 
 */

import java.util.Scanner;
class sort_0_1_2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int []arr =new int[n];
        
        System.out.println("Enter the elements of the array (0s, 1s, and 2s only):");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        checkElements(arr, n);
        sort012(arr, n);
        System.out.println("Sorted array:");
        printArray(arr,n);
    }
    public static void checkElements(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i] != 0 && arr[i] != 2 && arr[i] != 1){
                System.out.println("Invalid input. Please enter only 0s, 1s, and 2s.");
                System.exit(0);
            }
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort012(int arr[],int size){
        int z=0, o=0, t=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                z++;
            }else if(arr[i]==1){
                o++;
            }else if(arr[i]==2){
                t++;    
            }
        }

        int i=0;
        while(z>0){
            arr[i++] = 0;
            
            z--;
        }
        while(o>0){
            arr[i++] = 1;
            
            o--;
        }
        while(t>0){
            arr[i++] = 2;
            
            t--;    
        }
    }
}
