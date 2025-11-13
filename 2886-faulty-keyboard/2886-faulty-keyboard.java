class Solution {
    public String finalString(String s) {
        // Time - O(N) Space -O(1)
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
            if(ch=='i'){
                result.reverse();
            }else result.append(ch);
        }
        return new String(result);
    }
    
    
}