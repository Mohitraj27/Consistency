class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        
        /*
        Algorithm Used
        1. Intially arrys is created and intialized  with null
        2. after that the arrays  of string is split with spaces
        3. now iterating of each word is done using for loop in sent array
        4. length of searchWord is calculated and to find prefix .startsWith is used 
        5. 
        */
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