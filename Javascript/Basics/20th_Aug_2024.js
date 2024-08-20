// Program to check a number is prime or not
function isPrime(n) {
  if (n <= 1) {
    return false;
  }
  for (let i = 2; i < n; i++) {
    if (n % i == 0) {
      return false;
    }
    return true;
  }
}
console.log(isPrime(5));

// Even Or Odd Check
function isOddOrEven(n) {
  if (n < 0) {
    return "Enter a Positive Number";
  } else if (n % 2 == 0) {
    return "Even";
  } else if (n % 2 != 0) {
    return "Odd";
  } else {
    return "Invalid";
  }
}

console.log(isOddOrEven(123));

/* Some Practice Task using Json Object
1. Extract and log the name of the library and its location.
2. Extract and log the title and author of each book in the library.
3. Find and log the titles of all books published before the year 1950.
4. Extract and log all genres of the book titled "1984".
5. Count and log the total number of books in the library.
*/

const Object = {
  libraryName: "City Library",
  location: "Downtown",
  books: [
    {
      title: "To Kill a Mockingbird",
      author: "Harper Lee",
      yearPublished: 1960,
      genres: ["Fiction", "Classic", "Historical"],
    },
    {
      title: "1984",
      author: "George Orwell",
      yearPublished: 1949,
      genres: ["Dystopian", "Science Fiction", "Political Fiction"],
    },
    {
      title: "The Great Gatsby",
      author: "F. Scott Fitzgerald",
      yearPublished: 1925,
      genres: ["Fiction", "Classic", "Tragedy"],
    },
    {
      title: "The Catcher in the Rye",
      author: "J.D. Salinger",
      yearPublished: 1951,
      genres: ["Fiction", "Classic", "Literature"],
    },
  ],
};

console.log(`Library Name: ${Object.libraryName}`);
console.log(`Location: ${Object.location}`);

for (let i = 0; i < Object.books.length; i++) {
  console.log(`${Object.books[i].title} by ${Object.books[i].author}`);
}

for (let i = 0; i < Object.books.length; i++) {
  if (Object.books[i].yearPublished < 1950) {
    console.log(`${Object.books[i].title}`);
  }
}

const book = Object.books.find((book) => book.title === "1984");
console.log(book.genres.join(" "));

console.log(Object.books.length);

// Prompt the user to enter full name. Generate a username based on the input
// Start with username with @, followed by their full name and ending with fullname length
// Eg : If user enters fullname as John Doe, then username will be @JohnDoe3
const prompt = require("prompt-sync")();

const name = prompt("Enter your full name: ");

const username = `@${name.toLowerCase().split(" ").join("")}${name.length}`;
console.log(username);
