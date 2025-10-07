class Solution {
    public int singleNumber(int[] nums) {
    int ans = 0;
        //for loop for extracting each element of the array.
    for(int i = 0; i<nums.length; i++){
        //XOR operator is used here
        ans ^= nums[i];
    }
    return ans;
}

}
/*
Let's say we have an array - [2,1,4,5,2,4,1].
What we are doing is essentially this-

=> 0 ^ 2 ^ 1 ^ 4 ^ 5 ^ 2 ^ 4 ^ 1

=> 0^ 2^2 ^ 1^1 ^ 4^4 ^5 (Rearranging, taking same numbers together)

=> 0 ^ 0 ^ 0 ^ 0 ^ 5

=> 0 ^ 5

=> 5
*/