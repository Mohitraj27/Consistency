class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Similar to isIsomorphic Strings Leet(code 205
        Map<Character,String> map =new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        for(int i= 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = arr[i];
            if( (map.containsKey(c) && !map.get(c).equals(word))
            || (!map.containsKey(c) && map.values().contains(word)) ){
                return false;
            }
            /*
             a -> dog
             b -> cat
             b -> cat
             a -> dog
            */
            map.put(c,word);
        }
        return true;
    }
}
/**
Step 1: Create a HashMap with Character and String 
Step 2: Split the words from the string and store it inside the String arr
Step 3: if the length of arr and pattern is not equal then return false
Step 4: Iterate through the pattern length and take each character of the string and store the each word from the String 
Step 5: Check with the condition that inside the map either the character from the pattern nor the words from the String array should be present inside the Map . then update one character as a key inside the Map and its association with the String pattern else return false there itself.
Step 6: After Iteration stops, return true.
Time - O(N) Space o(N)
 */