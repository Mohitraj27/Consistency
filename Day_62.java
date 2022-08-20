//Leetcode Problem 1470 Shuffle the Array
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 */
class Day_62 {
   
    public int[] shuffle(int[] nums, int n) {
    int shuffle[]=new int[nums.length];
        int l=0,r=n;
        //l>> is for even positions 
        // r>> is intialized with n for the even positions
        for(int i=0;i<nums.length;i++)
        {  //for the odd positions of the elements
            if(i%2==0)
            {
                shuffle[i]=nums[l];
                l++;
            }
            else
                
            {
                //for the even position of the elements 
                shuffle[i]=nums[r];
                r++;
            }
        }
        return shuffle;
    }
}

/*Sample Test Cases
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
*/