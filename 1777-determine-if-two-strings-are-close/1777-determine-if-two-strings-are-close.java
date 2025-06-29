class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int[] ca1 = new int[26];
        int[] ca2 = new int[26];
        for(int i=0;i<word1.length();i++){
            ca1[word1.charAt(i)-'a']++;
            ca2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ca1[i] > 0 && !(ca2[i]>0)){
                return false;
            }
        }
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        return Arrays.equals(ca1,ca2);
    }
    // Time - O(N) Space - O(1)
}