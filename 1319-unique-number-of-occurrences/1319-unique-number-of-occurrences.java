class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if frequency values are unique
        Set<Integer> freqSet = new HashSet<>();
        for (int freq : freqMap.values()) {
            if (!freqSet.add(freq)) {
                return false; 
            }
        }

        return true;
    }
}
/**
    Step 1: Calulate the frequency of each of the elements in the array using HashMap
    Step 2: and check if that frequency should not be there for any other elements in the array by creating a HashSet

    Time - O(N) Space - O(N)
 */