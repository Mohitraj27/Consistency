class Solution {
    public String reverseVowels(String s) {
        /**
            Two ptrs start and end
            Intialize start to zeroth index and end to last Index of array
            Convert all the characters of a string to a CharArray
            Iterate throughout the String check through each character using
            start and end ptr are not Vowel then increment the start ptr by 1 
            and decrement ptr by 1 else if both are vowel then swap both the 
            vowels
            Time O(N) Space O(N) 
            
         */
        int n = s.length();
        char ch[] = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start < end){
            if(!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end]= temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch){
        if(ch =='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u'||ch =='A'||ch=='E'||ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }else{
            return false;
        }
    }
}