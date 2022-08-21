/* Leetcode Problem 43. Multiply Strings
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
 
class Day_63 {
public String multiply(String num1, String num2) {
if (num1.equals("0") || num2.equals("0")) {
return "0";
}
int l1 = num1.length();
int l2 = num2.length();
int[] result = new int[l1 + l2];
int factor = 0;
for (int j = l2 - 1; j >= 0; j--) {
int n2 = Character.getNumericValue(num2.charAt(j));
int curr = 0;
int r1 = result.length - 1;
for (int i = l1 - 1; i >= 0 || curr != 0; i--) { // main importance of carry
int n1 = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
int val = (n1 * n2) + curr + result[r1 - factor];
result[r1 - factor] = val % 10;
curr = val / 10;
r1--;
}
factor++;
}

    StringBuilder sb = new StringBuilder();
    boolean flag = false;
    for (int k = 0; k < result.length; k++) {
        if (result[k] == 0 && flag == false) {
            continue;
        } else {
            flag = true;
            sb.append(Integer.toString(result[k]));
        }
    }

    return sb.toString();
}
}