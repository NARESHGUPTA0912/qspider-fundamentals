/**
 * ! Implicit Type Coercion
 
const a = 10;
const b = "5";

console.log( a - b);  // 5
console.log( a * b);  // 50
*/

/**
 * ! Explicit Type Coercion


const a = 10;
const b = Symbol(a);
console.log(b); // 10n
console.log(typeof(b));  // bigInt
 
* ! Nested typeof
const a = 10;
const x = typeof(typeof(a));
console.log("x:",x);
*/
