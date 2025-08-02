import java.util.*;
class kth_smallest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element of k");
        int k = sc.nextInt();
        sc.close();
        System.out.println("Given Array");
        printArray(arr);
        kth_smallest obj = new kth_smallest();
        int result = obj.findkthsmallest(arr,k);
        System.out.println((result != -1) ? "Kth Smallest element " + result : "Invalid Value of k");
    }
        
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
     public int findkthsmallest(int arr[],int k){
        int n=arr.length;
        if(k<=n && k>0){
            bubbleSort(arr);
            return arr[k-1];
        }else{
            return -1;
        }
    }
    // sorting will done in reverse order to find kthSmallest Element
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}