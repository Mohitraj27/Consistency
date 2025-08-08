import java.util.*;
public class kth_min_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size  = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();   

        sc.close();
        int result = getMinDiff(arr,k);
        System.out.println("The minimum difference is: " + result);

    }
    public static int getMinDiff(int[] arr, int k) {
    
           int n = arr.length;
        Arrays.sort(arr);
        
        int result = arr[n - 1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        if (smallest > largest) {
            int temp = smallest;
            smallest = largest;
            largest = temp;
        }
        
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);
            
            result = Math.min(result, maxHeight - minHeight);
        }
        
        return result;
    }
    
}

