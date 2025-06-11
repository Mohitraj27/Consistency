class Solution {
    public int findLucky(int[] arr) {
        // Step 1: Store the frequency of all the elements in the array 
         Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxLucky = -1;

        // Step 2: Check if number == its frequency and update it to maxLucky variable and also check everytime for max value
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (number == frequency) {
                maxLucky = Math.max(maxLucky, number);
            }
        }

        return maxLucky;
        // Time - O(n) Space - O(n)
    }
}