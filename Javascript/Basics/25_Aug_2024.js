// callback -> a function is passed as an argument to another function
function sum(a,b){
    return a+b;
}
function calculator(a,b,sumCallback){
   return sumCallback(1,2,sum);
}

console.log(calculator(1,2,sum));