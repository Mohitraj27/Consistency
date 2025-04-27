class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String x=s.trim();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' '){
                count = 0;
            }else{
                count ++;
        }
            }
            return count;
    }
}