/**
 * 1. Write a JavaScript program to display the current day and time in the following format.  
Sample Output : Today is : Tuesday.
Current time is : 10 PM : 30 : 38
 */
const Today = new Date();

console.log(`Today Date is : ${Today.getDate()}`);
console.log(
  `Current Time is ${Today.getHours()}: ${Today.getMinutes()}: ${Today.getSeconds()}`
);

// expected I/P = "mohit from jharkand"
// expected o/p = "jharkand from mohit"

const variable = "mohit from jharkand";
console.log(variable.split("").reverse().join(""));
