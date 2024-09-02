// Clousre in Javascript
function outerFunction() {
    let outerVariable = 'I am from outer function';

    function innerFunction() {
        console.log(outerVariable); // 'I am from outer'
    }

    return innerFunction;
}

const myClosure = outerFunction();
myClosure(); 