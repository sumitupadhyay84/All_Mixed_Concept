Destructuring in JavaScript is a powerful feature introduced in ES6 (ECMAScript 2015) that provides a concise and convenient way to extract values 
from arrays or properties from objects into distinct variables. It simplifies code, improves readability, and makes working with data structures more efficient.

1. Array Destructuring:
Array destructuring allows you to unpack elements from an array into individual variables based on their position.

const numbers = [10, 20, 30];
const [a, b, c] = numbers;

console.log(a); // 10
console.log(b); // 20
console.log(c); // 30

Skipping elements: You can skip elements by leaving empty commas.

    const colors = ["red", "green", "blue"];
    const [firstColor, , thirdColor] = colors;
    console.log(firstColor); // red
    console.log(thirdColor); // blue

Rest element: The rest element (...) collects remaining elements into a new array.

    const data = [1, 2, 3, 4, 5];
    const [first, second, ...rest] = data;
    console.log(first); // 1
    console.log(second); // 2
    console.log(rest); // [3, 4, 5]

 Object Destructuring:
Object destructuring allows you to extract properties from an object into variables, using the property names as variable names.

const person = { name: "Alice", age: 30 };
const { name, age } = person;

console.log(name); // Alice
console.log(age); // 30

Renaming variables: You can rename the extracted variables using a colon.

    const user = { username: "john_doe", email: "john@example.com" };
    const { username: userIdentifier, email } = user;
    console.log(userIdentifier); // john_doe
    console.log(email); // john@example.com

Default values: You can provide default values for properties that might not exist in the object.

    const settings = { theme: "dark" };
    const { theme, fontSize = 16 } = settings;
    console.log(theme); // dark
    console.log(fontSize); // 16

Rest properties: The rest properties (...) collect remaining properties into a new object.

    const product = { id: 1, name: "Laptop", price: 1200, category: "Electronics" };
    const { id, name, ...details } = product;
    console.log(id); // 1
    console.log(name); // Laptop
    console.log(details); // { price: 1200, category: "Electronics" }

3. Destructuring in Function Parameters:
Destructuring is particularly useful when working with function parameters, allowing you to directly extract specific values from passed arrays or objects.

  // Array destructuring in function parameters
function printCoordinates([x, y]) {
    console.log(`X: ${x}, Y: ${y}`);
}
printCoordinates([10, 20]); // X: 10, Y: 20

// Object destructuring in function parameters
function displayUserInfo({ name, age }) {
    console.log(`Name: ${name}, Age: ${age}`);
}
displayUserInfo({ name: "Bob", age: 25 }); // Name: Bob, Age: 25
