class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //Optimal Solution using two pointer approach
        int left_pointer=0,right_pointer=0;
        
        //This Hashset will help to check for the duplication & repition of characters
        Set<Character> seen=new HashSet();
        
        //For counting the longest substring 
        int longest_substring=0;
        while(right_pointer<s.length())
        {
            char c=s.charAt(right_pointer);
            if(seen.add(c))
            {
                longest_substring=Math.max(longest_substring,right_pointer-left_pointer+1);
                right_pointer++;
                
            }
            else
                //for duplication of characters
            {
                while(s.charAt(left_pointer)!=c)
 
            { 
                    //This while loop will work until the left character is removed
                    seen.remove(s.charAt(left_pointer));
                left_pointer++;
            }
            //Below logic will work if there is duplication of character
            seen.remove(c);
            left_pointer++;
            }
        }
        
        return longest_substring;
        }
        
        
    }
