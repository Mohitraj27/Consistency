function findMissingNumber(arr) {
    const n = arr.length + 1; 
    const totalSum = (n * (n + 1)) / 2; 
    const currentSum = arr.reduce((acc, num) => acc + num, 0); 
    return totalSum - currentSum; 
}

// Example usage
const arr = [1, 2, 4, 5, 6];
console.log(findMissingNumber(arr));  
