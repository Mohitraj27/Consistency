import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        // Precompute row numbers for all letters (ASCII lookup)
        int[] rows = new int[26];
        for (char c : "qwertyuiop".toCharArray()) rows[c - 'a'] = 1;
        for (char c : "asdfghjkl".toCharArray()) rows[c - 'a'] = 2;
        for (char c : "zxcvbnm".toCharArray()) rows[c - 'a'] = 3;

        List<String> result = new ArrayList<>();

        outer: // label for continue control
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            int row = rows[chars[0] - 'a'];

            for (int i = 1; i < chars.length; i++) {
                if (rows[chars[i] - 'a'] != row) {
                    continue outer; // skip this word immediately
                }
            }

            result.add(word);
        }

        return result.toArray(new String[0]);
    }
}
