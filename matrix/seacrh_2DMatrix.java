package matrix;

/*
 Leetcode 74. Search a 2D Matrix
Medium

14035

374

Add to List

Share
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 
 */
import java.util.*;
public class seacrh_2DMatrix 
{
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of rows and columns of the matrix");
  int m=sc.nextInt();
  int n=sc.nextInt();
    
   int arr[][]=new int[m][n];


     System.out.println("Enter the matrix elements");
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
  }
 System.out.println("Enter target value to search");
 int target=sc.nextInt();

   seacrh_2DMatrix solution=new seacrh_2DMatrix();
  boolean result= solution.binarySearch(arr,target);
   

  
  if(result){
    System.out.println("Target value found");
  }
  else{
    System.out.println("Target value not found");
  }

}
  // using linear searching technique 
public boolean  Search(int arr[][],int target)
{
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return true;
            }
        }
    }
    return false;
}

// can also use binary seacrh technqiue (optimized approach)
public boolean binarySearch(int arr[][],int target){
    int m=arr.length;
    int n=arr[0].length;
    
    int left=0,right=m*n-1;

    while(left<=right){
        int mid=left+(right-left)/2;
        int midValue=arr[mid/n][mid%n];

        if(midValue==target){
            return true;
        }
        else if(midValue<target)
        {
            left=mid+1;
        }
        else {
            right=mid-1;
        }
    }
    return false;
}


}