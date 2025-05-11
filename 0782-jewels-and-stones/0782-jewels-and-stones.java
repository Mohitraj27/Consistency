class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> stoneCountMap = new HashMap<>();
        /*Count frequency of each stone character and store it inside the Map along with the character */
        for (char ch : stones.toCharArray()) {
            stoneCountMap.put(ch, stoneCountMap.getOrDefault(ch, 0) + 1);
        }
        int result = 0;
        /* Iterate through jewels string and check by picking each characters from jewels string the total frequency and add that frequecny to result variable */
        for (char jewel : jewels.toCharArray()) {
            result += stoneCountMap.getOrDefault(jewel, 0);
        }
        return result;
    }
}