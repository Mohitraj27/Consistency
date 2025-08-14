import java.util.*;
class min_max_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int findMinresult = MinimumNum(arr,size);
        System.out.println("Min number"+findMinresult);
        int findMaxresult = MaximumNum(arr,size);
        System.out.println("Maximum Number"+findMaxresult);
    }
    public static int MinimumNum(int arr[],int size){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int MaximumNum(int arr[],int size){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}