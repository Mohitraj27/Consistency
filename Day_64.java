/* Leetcode Problem 2114
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
*/
class Day_64 {
    public int mostWordsFound(String[] sentences) {
      int maxWord=0;
// Approach :O(n)        
        for(int i=0;i<sentences.length;i++){
            
            if(wordCount(sentences[i])>maxWord){
                maxWord=wordCount(sentences[i]);
              
            }
   
    }
        return maxWord;
    }
    
    
    
    
   // Count no of words in the sentence-> no of whitespace+1 = number of words 
    public static  int wordCount(String s){
        int count=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
}

/*
 Sample Test Cases
 Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */