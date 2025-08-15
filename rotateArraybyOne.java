import java.util.*;
class rotateArraybyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        rotate(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        System.out.print("Rotated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] arr) {
        if (arr.length == 0) return; 

        int n = arr.length;
        for(int i=0;i<n;i++){
             int temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            
        }
    }
    }
