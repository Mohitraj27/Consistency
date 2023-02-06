class Solution {
    public static List<Integer> majorityElement(int[] nums) {
        
        //Using this Burte force approach 
        /* At first Create an array List to store the list of numbers
         we check each element of an array 
         and intialize count to 1 
         if any element of an array is similar to its next element 
         increment the counter variable to ++
         and if the count is greater than n/3 or (n/kth ) element
         add it to the arraylist created after iterating throughout the array 
         return the arrayList
//         */
//         ArrayList <Integer> ans=new ArrayList<> ();
        
//         for(int  i=0;i<nums.length;i++)
//         {
//             int count=1;
//             for(int j=i+1;j<nums.length;j++)
//             {
                
//                 if(nums[i]==nums[j])
                
//                     count++;
//             }
//           if(count>(nums.length/3))
        
//             ans.add(nums[i]);
//         }
//                 return ans;
    
    int number1=-1,number2=-1,count1=0,count2=0, len=nums.length;
        
        for(int i=0;i<len;i++)
        {
            if(nums[i]==number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
            else if(count1==0){
                number1=nums[i];
            count1=1;
        }
        else if(count2==0)
        {
            number2=nums[i];
            count2=1;
            
        }
            else {
                count1--;
                count2--;
            }
        }
    
        
        ArrayList <Integer> ans=new ArrayList<Integer>();
        count1=0;
        count2=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
        }
        if (count1 > len / 3)
      ans.add(number1);
    if (count2 > len / 3)
      ans.add(number2);
    return ans;
    }
        
        
      
    
}