class Solution {
    public int maxVowels(String s, int k) {
        int left =0, right =0, result =0,window=0;
        for(;right<k;right++){
            window+= isVowel(s.charAt(right));
        }
        result = window;
        while(right < s.length()){
            window -= isVowel(s.charAt(left++));
            window += isVowel(s.charAt(right++));
            result = Math.max(result,window);
        }
        return result;
    }
    private int  isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ? 1 : 0;
    }
}