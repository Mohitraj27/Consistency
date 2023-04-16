class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count=0;
        //Linear Search Technique
        for(int i=0;i<words.length;i++)
        {
            //if(words[i].contains(pref))
            //Here I've used startsWith function for prefix instead of .contains(pref)
            if(words[i].startsWith(pref))
            {
                count++;
              //  return count;
            }
            //return 0;
        }
        return count;
    }
}