/* Move all the negative elements to end 
 
Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1]
 */
 import java.util.*;
class negative_elementstoend {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of aray");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        List<Integer> result = movenegativeElemtToEnd(arr);
        System.out.println("Final Result "+result);
    }
    public static List<Integer>  movenegativeElemtToEnd(int arr[]){
        int n=arr.length;
        List<Integer> temp =new ArrayList<>();
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp.add(arr[i]);
                j++;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp.add(arr[i]);
                j++;
            }
        }
        
        return temp;
    }
}