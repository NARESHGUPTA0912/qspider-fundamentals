1) && (Logical AND) vs || (Logical OR)

Operator	Behavior
&& → AND	Returns the first falsy value, otherwise returns the last operand. Used for short-circuiting conditions.
`	
✅ Examples:
js


let x = false;
let y = "hello";
let z = null;
console.log(x && y);        // false → because first is falsy → stops here  
console.log(y || z);        // hello → because y is truthy
// Real use case: Safe fallbacks (common pattern!)
const name = user.name ?? "Anonymous"; 
// Equivalent to:
let name = user.name || "Anonymous";
// Also used in function composition
function validateInput(value) {
    if (!value && !value.length) return false;
    // Can also write this as:
    return value && value.length > 0;  
}
⚠️ Common Pitfall:
Don’t use || for defaults when dealing with null, undefined, or empty strings — it may silently break. Prefer optional chaining (?.) or nullish coalescing (??) in modern JS.

2) Logical OR (||) – In-Depth
✅ Definition:
The logical OR operator (||) returns the first truthy value in an expression. If all values are falsy, it returns the last one (the right-hand operand).

It’s a short-circuiting operator: evaluates left-to-right and stops as soon as a truthy result is found.

📌 Truth Table:


Left	Right	Result
false	"hello" → "hello" ✅	
0	null → null ❌	
""	5 → 5 ✅	
true	anything → first value ✅	
💡 Real-World Use Cases:
A) Default Value Assignment (Fallbacks)
js


const name = user.name || "Anonymous";
// If user.name is undefined or null, uses fallback.
B) Function Arguments with Defaults
js


function log(message = "No message") {
    console.log("[LOG]", message);
}
log(); // → "[LOG] No message"
log("Hi"); // → "[LOG] Hi"
⚠️ Warning: Don’t use || for null/undefined only — better alternatives:

js

const safeName = user?.name ?? "Guest";  // Nullish coalescing (ES2020)
Avoids coercion issues like "0" || false → true, which is dangerous.

✅ Summary:
Use || for fallbacks, not equality checks. Prefer optional chaining (?.) + nullish coalescing (??) in modern JS to prevent silent type coercion bugs.

const name = user.name || "Anonymous";
// If user.name is undefined or null, uses fallback.
