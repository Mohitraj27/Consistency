import java.util.*;
class min_max{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        min_max sol = new min_max();
        int[] result = sol.findMinMax(arr, n);

        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }
    public int[] findMinMax(int arr[], int n) {
        if (n == 0) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}; // Handle empty array case
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}