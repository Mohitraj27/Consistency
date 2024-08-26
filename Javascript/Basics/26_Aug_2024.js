//You are given an object representing a user's credentials with two fields: username and password. 
//Write a function called maskAndSwapCredentials that swaps the values of username and password and then masks
// the password by replacing all characters except the first and last with asterisks (*).
const credentials = {
    username: "user123", 
    password: "securePassword"
};

function maskAndSwapCredentials(credentials) {
    let temp = credentials.username;
    credentials.username = credentials.password;

    // Mask the password except the first and last characters
    credentials.password = maskPassword(temp);

    return credentials;
}

function maskPassword(str) {
    if (!str || str.length <= 2) return str; 
    return str[0] + '*'.repeat(str.length - 2) + str[str.length - 1];
}

const result = maskAndSwapCredentials(credentials);
console.log(result); 
// Expected Output: { username: "securePassword", password: "u******3" }

