import java.util.Scanner;
class kth_largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        sc.close();
        
        kth_largest obj=new kth_largest();
        int result = obj.findKthLargest(nums,k);
        if(result!=-1){   
            System.out.println("The "+k+" largest element "+" of "+ result);
        }
    }
            
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        
        if (k > 0 && k <= n) {
            bubbleSort(nums);
            return nums[k - 1];
        } else {
            System.out.println("Invalid value of k");
            return -1;
        }
    }
    public static void bubbleSort(int nums[]){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}














