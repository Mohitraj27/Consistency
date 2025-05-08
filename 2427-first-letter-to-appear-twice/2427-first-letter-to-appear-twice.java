class Solution {
    public char repeatedCharacter(String s) {
      Set<Character> result =new HashSet<Character>();
      for(int i=0;i<s.length();i++){
        if(result.contains(s.charAt(i))){
            return s.charAt(i);
        }else{
            result.add(s.charAt(i));
        }
      }
      return 'q';   
    }
}