class Solution {
    public int findGCD(int[] nums) {
        
        
        //First sort the array
        Arrays.sort(nums);
        //find the largest & smallest element of a array
        int largest=nums[nums.length-1];
        int smallest=nums[0];
       //Using the concept of gcd of two number
        while(largest!=smallest)
        {
            if(largest>smallest)
                largest=largest-smallest;
            else smallest=smallest-largest;
        
        }
        return largest;
        
        
        
    }
}