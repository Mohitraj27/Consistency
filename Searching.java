// Binary Search Time - O(logN) Space - O(1)
import java.util.*;
public class Searching {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target Value");
        int target = sc.nextInt();

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[]=new int [size];


        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int result = binarySearchAlgo(arr,target);
        // int result = linearSearchAlgo(arr,target);
        if(result!=-1){
            System.out.println("Value found "+ arr[result] +" at index "+ result);
        }else {
            System.out.println("Value not found");
        }
    }
    // Applying Binary Search Time -  O(log N) Space - O(1)

    public static int binarySearchAlgo(int arr[],int target){
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    // Applying Linear Seach Algorihtm O(N)
    public static int linearSearchAlgo(int arr[],int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}