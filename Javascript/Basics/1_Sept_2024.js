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



/**
 * 
 * Problem Statement: Order Processing System
Description:

You are tasked with building an order processing system for an online store. The system needs to handle multiple types of products and apply various discounts and taxes based on different criteria. The requirements are as follows:

Product Categories:

Electronics
Clothing
Groceries

Discounts:
Electronics: 10% discount on orders above $1000.
Clothing: 15% discount on orders above $500.
Groceries: No discount.
Taxes:

Electronics: 18% tax on the discounted price.
Clothing: 12% tax on the discounted price.
Groceries: 5% tax on the total price.

Shipping Charges:
Orders below $500: $50 shipping charge.
Orders between $500 and $1000: $25 shipping charge.
Orders above $1000: Free shipping.
Order Calculation:

The system should calculate the final price after applying the discount (if any), then apply the tax, and finally add the shipping charges.
The system should be able to handle multiple products in a single order, with each product potentially belonging to a different category.
Input Format:

An array of objects where each object represents a product. Each object contains the following properties:
name (String): The name of the product.
category (String): The category of the product.
price (Number): The price of the product before any discounts or taxes.
quantity (Number): The quantity of the product ordered.
Output:

The system should return an object containing:
totalPrice (Number): The total price of the order after all calculations.
discountsApplied (Object): An object showing the discounts applied to each product category.
taxesApplied (Object): An object showing the taxes applied to each product category.
shippingCharge (Number): The total shipping charge for the order.

Constraints:
The system should handle large orders efficiently, considering the possibility of hundreds of products in a single order.
Ensure that all calculations are precise, especially when dealing with decimals (e.g., use toFixed() for rounding where necessary).
 */

const order= [
    { name: "Laptop", category: "Electronics", price: 1200, quantity: 1 },
    { name: "T-Shirt", category: "Clothing", price: 60, quantity: 10 },
    { name: "Bananas", category: "Groceries", price: 1, quantity: 100 }
]

const result = processOrder(order); // TODO


