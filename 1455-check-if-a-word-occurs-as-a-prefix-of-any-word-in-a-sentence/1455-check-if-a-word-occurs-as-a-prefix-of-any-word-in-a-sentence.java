class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
         String[] sent=null;
         
        sent=sentence.split(" ");
        for(int i=0;i<sent.length;i++)
        {
            int len=searchWord.length();
//             if(sent[i].contains(searchWord) && sent[i].substring(0,len).equals(searchWord)) 
                
              if(sent[i].startsWith(searchWord))  
                
                return i+1;
        } 
        return -1; 
        
        
    }
}