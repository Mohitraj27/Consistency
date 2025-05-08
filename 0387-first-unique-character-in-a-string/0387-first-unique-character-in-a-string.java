class Solution {
    public int firstUniqChar(String s) {
        /** Time -O(N) Space - O(1)
            Create a HashMap of Character and Integer type and store all the characters inside that HashMap along with 
            their frequency and return that character which has frequency 1 that will be considered as unique
         */
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}