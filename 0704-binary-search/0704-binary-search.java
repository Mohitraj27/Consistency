class Solution {
    public int search(int[] nums, int target) {
        
        //Applting Binary search algorithm
        //Intialize the starting element to 0 and ending element to length of arrat
          int start=0;
        
       int end=nums.length-1;
        
       while(start<=end)
       {
           //Extracting the middle value of a array
           int mid=(start+end)/2;
           
           if(nums[mid]==target)
               return mid;
           
           else if(nums[mid]<target){
           
               start=mid+1;
           }else{
               end=mid-1;
           }
       }
        //using basic linear search technique
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==target)
//             {       return i;
//         }   
       
//     } 
           
        return -1;
}
}