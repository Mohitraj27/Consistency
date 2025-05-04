class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char []arr = s.toCharArray();
        while(i<j){
            if(isValidEnglishChar(arr[i])){
                while(!isValidEnglishChar(arr[j])){
                    j--;
                }
                // swap using temp variable 
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            i++;
        }
        return new String(arr);
    }
    public boolean isValidEnglishChar(char c){
        return (65<=c && c<=90)||(97<=c && c<=122);
    }
    
}