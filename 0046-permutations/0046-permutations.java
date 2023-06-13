class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        /* algorithm used
        Create a function named permute that takes an integer array nums as input and returns a list of lists List<List<Integer>> containing all the permutations.

Initialize an empty list list to store all the permutations.

Call the backtrack function, passing the list, an empty temporary list tempList, and the nums array as parameters.

Implement the backtrack function:

a. Check the base case: If the size of the tempList is equal to the length of the nums array, it means that a permutation is complete. Add a copy of tempList to the list using new ArrayList<>(tempList).

b. If the base case is not met, iterate through the elements of the nums array using a for loop:

Check if the current element nums[i] is already present in the tempList. If it is, skip to the next iteration using continue.

Add the current element nums[i] to the tempList using tempList.add(nums[i]).

Recursively call the backtrack function with the updated list, tempList, and nums.

Remove the last element from the tempList using tempList.remove(tempList.size() - 1) to backtrack and try other permutations.

After the backtrack function returns, return the list containing all the permutations.

time -O(n!*n) space -O(n)
        */
        // created one list that contains all the possible permutations 
        List<List<Integer>> list = new ArrayList<>();
   // Arrays.sort(nums); // not necessary
        // used backtracking algo and passed the created list , temp list for storing current element permutaion adn nums arrray as a parameters
   backtrack(list, new ArrayList<>(), nums);
   return list;
}

    // writing seperate backtracking functions 
private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
   // base case if list size is equal to array length means possible permutation of array is completed and add a copy of templist to list 
    // using new ArrayList<>(tempList)
    if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
   }
    // if size is not equal iterate such that 
    else{
      for(int i = 0; i < nums.length; i++)
      {  // if duplicates exist ignore
         if(tempList.contains(nums[i])) continue; // element already exists, skip
           //add that current element to the function 
          tempList.add(nums[i]);
          // backtrack to find the possible permutaion of that current element 
         backtrack(list, tempList, nums);
          // remove that current eleemnt whhich you dont want to include inside the permutaion
         tempList.remove(tempList.size() - 1);
      }
   }
}
}