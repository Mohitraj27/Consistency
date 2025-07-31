import java.util.*;
class MergeSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){     
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Given array is");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array is");
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int []arr,int left,int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            conquer(arr,left,mid,right);
        } else {
            return;
        }
    }
    public static void conquer(int []arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int []L = new int[n1];
        int []R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++] = L[i++];
            }else {
                arr[k++] = R[j++];
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }

}