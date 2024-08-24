// check Duplicates in an array O(N^2)
function hasDuplicates(arr){
    for(let i=0;i<arr.length;i++){
        for(let j=i+1;j<arr.length;j++){
            if(arr[i]===arr[j]){
                return true;
            }
        }
        
    }
    return false;
}
// Optimzed approach using set O(N)
function Duplicates(arr){
    const seen=new Set();
    for(let i=0;i<arr.length;i++){
        if(seen.has(arr[i])){
            return true;
        }
    seen.add(arr[i]);
    }
    return false;
}
console.log(hasDuplicates([1,2,-23,123,-2,23]));
console.log(Duplicates([1,2,-23,123,-2,-23]));


// Problem Statement : Given a username with two fields first name and last name i want to interchange the values of both the fields
// Sample Input : firstname: "Mohit" lastname: "Raj" -> Expected Output firstname: "jaR" lastname: "tihoM"

function swapAndReverseUserName(user){
    let reverseFirstName = reverseString(user.firstname);
    let reverseLastName = reverseString(user.lastname);

    user.firstname = reverseLastName;
    user.lastname = reverseFirstName;
    
    return user;
}

function reverseString(str){
    return str.split('').reverse().join('');
}
let user ={
    firstname:"Mohit",
    lastname:"Raj"
}

console.log(swapAndReverseUserName(user));


