class Solution {
    public void sortColors(int[] arr) {
       int size=arr.length;
         boolean isSwapped=false;
        for(int i=0;i<size-1;i++){
           
            for(int j=0;j<size-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   isSwapped=true;
                   
               } 
            }
            if(!isSwapped) break;
            
            
        }
       
    }
}