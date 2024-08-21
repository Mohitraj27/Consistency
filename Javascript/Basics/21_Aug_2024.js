//  function that filters the people array to return only those people who are 25 years old.

const people = [
    { name: "Alice", age: 25, city: "New York" },
    { name: "Bob", age: 30, city: "San Francisco" },
    { name: "Charlie", age: 35, city: "Los Angeles" },
    { name: "David", age: 25, city: "Chicago" }
];

function filterByAge(people, age) {
    return people.filter(person => person.age === age);
}

function filterByName(people,name){
    return people.filter(person => person.name === name);
}
// Test case
console.log(filterByAge(people, 25));
console.log(filterByName(people,'Charlie'))
