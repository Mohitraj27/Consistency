class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        String res="";
        //Here we'r iterrating through each word of the arrays words
        for(int i=0;i< words.length;i++)
        {
            // res string variable is intilalized with empty space and it
            // is compared with s 
            res+=words[i];
           // if(res.startsWith(s))
  if(res.equals(s))
      {
                return true;
            }
         
        }
        return false;
        
    }
    
}