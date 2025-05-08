class Solution {
    public boolean checkIfPangram(String s) {
        /**
            Create a Set And Iterate through each characters of the String 
            and store it after iteration stops then checks the size of Set if it is 26 then true else false
            means atleast every characters of English alphasbet is there
            time  - O(N) Space - O(1)
         */
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size()==26 ? true: false;
    }
}