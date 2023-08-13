/*
 Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

 */

package matrix;

import java.util.*;
public class SpiralTraverseMatrix{

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the no of row:");
    int r=sc.nextInt();
    
    System.out.println("Enter the no of column");
    int c=sc.nextInt();
       int arr[][]=new int[r][c];
  
    System.out.println("Enter the elements of the array");
       
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
        arr[i][j]=sc.nextInt();
    }
  }
  ArrayList<Integer> result= spirallyTraversalMatrix(arr, r, c);
  for (int num : result) {
    System.out.print(num + " ");
}
}
public static ArrayList<Integer> spirallyTraversalMatrix(int arr[][], int r, int c)
{
 /*   using four pointers 
        l-> start column    u-> start row
        r -> end column     d-> end row
 */ 

 ArrayList<Integer> result=new ArrayList<Integer>();
int l=0,u=0,d=r-1,right=c-1;

//condition for traversal from left to right 
while(l<=right && u<=d){
    for(int i=l;i<=right && l<=right && u<=d;i++ ){
        result.add(arr[u][i]);
    }
    u++;
// from top to bottom
 for(int i=u;i<=d && l<=right && u<=d;i++)
 {
    result.add(arr[i][right]);
 }
 right--;
      // Traverse from right to left
      if (u <= d) { // Check if there are more rows left to traverse
        for (int i = right; i >= l; i--) {
            result.add(arr[d][i]);
        }
        d--;
    }
    //Traverse from bottom to top
    if (l <= right) { // Check if there are more columns left to traverse
        for (int i = d; i >= u; i--) {
            result.add(arr[i][l]);
        }
        l++;
    }
}
return result;
}


}
