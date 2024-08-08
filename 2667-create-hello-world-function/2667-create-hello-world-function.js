/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        // console.log("Hello World")
        return "Hello World";
    }
};

// createHelloWorld();


const f = createHelloWorld();
f();
