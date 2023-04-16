class Solution {
    public int countPrefixes(String[] words, String s) {
       
        int count=0;
        //Using linear Search Technique
        for(int i=0;i<words.length;i++)
        {
            if(s.startsWith(words[i]))
            {  count++;
        }
        
        }
  return count;  
    
}}