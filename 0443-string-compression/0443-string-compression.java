class Solution {
    public int compress(char[] chars) {

          int n = chars.length;
        int index = 0;
        int i = 0;

        while (i < n) {
            char currChar = chars[i];
            int count = 0;

            // Count occurrences of current character
            while (i < n && chars[i] == currChar) {
                count++;
                i++;
            }

            // Set the current character
            chars[index++] = currChar;

            // If count > 1, convert it to string and add each digit to next index of every character
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char ch : countStr.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}
/**
     * Approach:
     * 1. Initialize two pointers: 
     *    - 'i' to iterate through the input array
     *    - 'index' to keep track of the position in the compressed array.
     * 
     * 2. For each character:
     *    - Store the current character in 'currChar'
     *    - Count its consecutive occurrences by comparing chars[i] with currChar.
     *    - Increment both 'count' and 'i' until a different character is found.
     * 
     * 3. Write the character at the 'index' position.
     * 
     * 4. If the count > 1:
     *    - Convert count to string.
     *    - Write each digit of the count string to the array, starting from 'index'.
     * 
     * 5. Continue until the full array is traversed.
     * 
     * Time Complexity: O(N), where N is the length of the input array.
     * Space Complexity: O(1), as we use constant extra space (in-place compression).
*/