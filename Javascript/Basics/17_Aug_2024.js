// sum of two numbers
function sum(a, b) {
  return a + b;
}
console.log(sum(12, 23));

function maxNum(a, b) {
  return a > b ? a : b;
}
console.log(maxNum(2, -123));

// Problem Statement: checks if the given string is a palindrome (reads the same forwards and backwards).

const readline = require("readline");
//Promp the user to enter a string
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("Enter a string: ", (s) => {
  function isPalindrome(s) {
    return s === s.split("").reverse().join("");
  }
  console.log(
    isPalindrome(s)
      ? "This string is a plaindrome"
      : "This string is not a plaindrome"
  );
  rl.close();
});
// Enter a string: MohitRaj
// This string is not a plaindrome
