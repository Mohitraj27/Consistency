import java.util.*;
class removeDuplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        removeDuplicates sol = new removeDuplicates();
        ArrayList<Integer> result = sol.removeDuplicates(arr,n);

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        } 
        sc.close();
    }
    public ArrayList<Integer> removeDuplicates(int arr[], int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        if(n== 0) {
            return result; // Return empty list if array is empty
        }
        result.add(arr[0]);
        for (int i = 1; i < n; i++) {
            // Check if the current element is different from the last added element then add it 
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return result;
    }

}