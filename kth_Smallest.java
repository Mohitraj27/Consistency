import java.util.*;
class kth_Smallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        sc.close();
        kth_Smallest sol = new kth_Smallest();
        int result = sol.kthSmallest(arr, n, k);
        
        if (result != -1) {
            System.out.println("The " + k + "th smallest element is: " + result);
        } else {
            System.out.println("Invalid value of k.");
        }
        
        sc.close();
    }
    public int kthSmallest(int arr[],int n, int k){
        if (k < 1 || k > n) {
            return -1; // Invalid k
        }
        // Sort the array using bubble sort
        for(int i=0;i<-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr[k - 1]; // Return the k-th smallest element
    }
}