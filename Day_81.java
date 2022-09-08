//Leetcode Problem 1323 Maximum 69 Number
/*
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

 
 */
class Day_81 {
    public int maximum69Number (int num) {
        int m = 3, a = 0, n = num;
while (n > 5) {
	if (n % 10 == 6)
		a = m;
	m *= 10;
	n /= 10;
}
if (a >= 3)
	return num + a;
return num;
        
    }
}
/*
 Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.
 */