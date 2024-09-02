/**
 * You are tasked with creating a function that takes a student's marks as input and returns their corresponding grade 
 * based on the following criteria:

If the marks are 90 or above, the grade should be "A".
If the marks are 80 to 89, the grade should be "B".
If the marks are 70 to 79, the grade should be "C".
If the marks are 60 to 69, the grade should be "D".
If the marks are below 60, the grade should be "F".
The function should handle edge cases, such as when the input is exactly on the boundary of two grade ranges (e.g., 90, 80, 70, 60), and it should return the correct grade.
 */
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function classifyGrade(number){
    if(number >=90){
        return 'A';
    }
    else if(number >=80 && number <=89){
        return 'B';
    }
    else if(number >=70 && number <=79){
        return 'C';
    }
    else if(number >=60 && number <=69){
        return 'D';
    }
    else if(number <=60){
        return 'F';
    }
    
}
rl.question('Enter your marks: ', (input) => {
    const marks = parseInt(input, 10);
    if (isNaN(marks) || marks < 0 || marks > 100) {
        console.log('Please enter a valid number between 0 and 100.');
    } else {
        console.log(`Your grade is: ${classifyGrade(marks)}`);
    }
    rl.close();
});




