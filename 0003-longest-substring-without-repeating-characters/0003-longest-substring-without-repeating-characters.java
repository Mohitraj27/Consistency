class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0,len=0;
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            
            if(map.containsKey(c))
            {
                if(start<=map.get(c))
                {
                    start=map.get(c)+1;
                }
            }
            
            len=Math.max(len,end-start+1);
            map.put(c,end);
        }
        return len;
    }
}