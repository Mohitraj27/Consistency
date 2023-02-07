class Solution {
    public String gcdOfStrings(String str1, String str2) {
      
        //if nothing comes common in between two string return blank space
            if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        //using same approach as that of GCD of integers
        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return str2.substring(0, a);
    }
}