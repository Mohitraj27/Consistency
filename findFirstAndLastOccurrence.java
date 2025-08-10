import java.util.*;

class findFirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        sc.close();
        int[] result = firstAndLastOccurence(arr, x);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
    
    public static int[] firstAndLastOccurence(int arr[], int x) {
        int first = -1, last = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i; // first occurrence
                }
                last = i; // last occurrence
            }
        }
        
        return new int[]{first, last}; // return array of size 2
    }
}
