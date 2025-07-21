class Solution {
    public String makeFancyString(String s) {
     StringBuilder result = new StringBuilder();

     int count = 1;

     result.append(s.charAt(0));

     for(int i=1; i < s.length(); i++){
        if(s.charAt(i) == s.charAt(i-1)){
            count+= 1;
        }else{
            count = 1;
        }

        if(count < 3){
            result.append(s.charAt(i));
        }
     }
     return result.toString();
    }
}