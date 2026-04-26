<!-- Day 1 -->
Q) What is JS?
Q) Features of JS
# Types of JavaScript
1. Internal JS      2. External JS

<!-- Day-2 -->
# D/f b/w async & defer (Claude AI)

1. async: downloads the script in parallel with HTML parsing but executes immediately when ready (pausing HTML parsing), with no guaranteed execution order between multiple async scripts.

2. defer: Downloads the scripts in parallel HTML parsing, but executes only after HTML parsing completes, maintaining the original order of the scripts in the document.

3. Use Case : Use async for independent scripts (analytics, ads) and defer for scripts that depend on the DOM or each other.

<!-- Day-3 -->
- History of Node JS

<!-- Day 4 -->

# Token : it is smallest unit of prog. lang.
ex - > const a = 10;

# Types of tokens
-> there are 5 types of tokens -> keywords, identifiers, operators, literals, punctuator;

# keywords -> keywords are predefined words which is used to perform some specific task.
1. they are always written in lower case letters.
ex -> if, else, for, while, break, continue, switch, extends, try, catch, finally, throw, class...
        function, var, let, const, delete, in.... etc.

# Identifiers -> they are user given names that is used in writing a program.
1. name of a class
2. name of a method
3. name of a variable
4. name of a package
5. name of a any other class member.

# Operators -> they are predefined symbols which is used to perform some specific tasks.
* Operands -> the values needed by an operator is known as operands.

# Types pf Operators :-
1. Unary operators:
    * Increment / decrement Operator (++, --)
    * Logical Not (!)

2. Binary Operator:
    * Assignment Op.
    * Arithmetic Op.
    * Relatinal or Comparison Op. (>, <, >=, <=, ==, !=, ===, !==)
        -> == loose equality
        -> != loose not equality
        -> === strict equality
        -> !== strict not equality
    * Logical AND / Logical OR Op.

3. Ternary Operator:
    * Conditional Operator 

==> Difference between loose equality (==) and strict equality(===) in 2 line?
    Loose equality(==): Compare values after type coercoin, coverting operands to the same before comparsion(eg, 5 == '5' = true)

    Strict equality(===)

==> Difference between loose not equality (!=) and strict not equality(!==) in 2 line?
    Loose inequality(!=):- returns true if value are different after coersion(5 != '5' = false).
    Strict inequality(!==) return true if the value are different after 

==>  Logical AND (&&):-

==> Logical OR(||):- 

<!-- Day 5 -->
 
# Literals:- Literals are different types of values that is used in writing a program.
 
# Types of Literals:- 2 types
   1. Primitive Literals:- 
          - Primitive values are single valued literals.
          - Primitive literals are immutable (can not change).
          - Types of Primitive Literals :- 8 types
                 i) number  ii) bigInt  iii) Nan  iv) boolean  v) null
                vi) undefined vii)string  viii) symbol
   
  2. Non Primitive Literals:-
          - Non primitive literals are multi valued literals.
          - Non primitive literals are mutable (can change).
          - Types of Non Primitive Literals:- 
              i) Function ii) Array  iii) Object     
 

  _Primitive Literals:-_
    1) number :-   floating or integer (-ve or +ve)
                    const a = -0.5;
    
    2) bigInt :- -infinity    to    +infinity
                    const b = 1n;
    
    3) Nan :- Nan stands for Not a Number
              It is computational error given by js engine.
              "10"    ------>   10
              "10x"   ------>   Nan (number)
    
                const x = 10;
                const y = "5abc";
                
                console.log(x - y);  // Nan
                console.log((x - y) * 5);   // Nan

    4)  Boolean:- True or Truthy | false or falsy
        falsy:- 0, 0n, 0.0, null, Nan, undefined, ""
     
    5&6) diff between null and undefined
    
        const m = null; // stored intentionally by developer
        let n;         // stored by js engine   n = undefined
    
    7) String:- Collection of characters
     * ! 1. Single Valued String:- "", ''
     * ! 2. Multi valued String or Template string: - `Backtick`

    # what is template String and what is string interpolation? :-(claude.ai)
      Template-String:-  A string notation in programming that allows embedding expressions and multi-line text. In javascript, it uses backticks(`) instead of quotes.

      StringInterpolation:- The process of inserting variable values or expressions directly into a string. It replaces placeholders with actual values at runtime.
            const user = "Ankit";
            const age = 21;
            const msg = `username ${user} and age ${age}`;
            console.log(msg);

    8) Symbol: 

# 5. Punctuators:-
   1. Group:- (),[],{}
   2. speparate:- comma(,) or semi-colon(;)
   3. inside object:- Dot(.)
      e.g.  const arr = [10 , 20,30];
            const obj = {username: "Raj"};
            console.log(obj.username )

<!-- Day-6 -->
# Scope in javascript:-
    1. Global Scope:-
    2. Local Scope:-
        ->Block Scope
        ->Function Scope

# Variable Shadowing in JS:- It occurs when a variable declared in an inner scope has thesame name as a variable in an outer scope. The inner variable "shadows" or hides the outer one within its scope.
    - e.g: let name = "Alice";  // outer scope
       function greet() {
        let name = "Bob";  // inner scope - shadows the outer 'name'
        console.log(name); // prints "Bob"
       }
    - keywords:- window, this, self, frames, (Node.js global) (standard:- globalThis)
    - Example:-   var a = 10;
                {
                    let a = "KD";
                    console.log(a);
                    console.log(window.a)
                }

<!-- Day 7 -->
# Type coercion:- To convert one type of data into another type with the help of js engine is known as type coercion/ type conversion.
1. Implicit type coercion: To convert one type of data into another type by js engine automatically(implicitly) is known as implicit type coercion.
2. Explicit type coercion: To convert one type of data into another type forcefully(explictly) by js engine is known as explicit type coercion.
    # Here we use inbuild functions to convert the data from one type into another:
    _primitive:_           _Non-primitive:_
       1) Number()              1) Array()
      2) String()              2) Object()
       3) Boolean()             3) Set()
       4) BigInt()              4) Map()
       5)  Symbol()

    Q) What is typeof Operator in javascript:- The typeof operator in js returns a string indicating the datatype of its operand(Variable, literal, expression). It evaluates operands like numbers, String, booleans objects, functions, undefined symbols, and bigints, returning their type as a string.
        example:- typeOf 42 = "number";

<!-- Day-8 -->
# Global Execution context(GEC):

_JS Engine_
     _______________________________
    |                               |
    |                               |
    |                               |
    |                               |
    |                               |
    |                               |
    |                               |
    |                               |
    `````````````````````````````````
    1. Variable Phase:-
        1. Variable Declaration Statement
                var a  = 10;
                let b = 20;

    2. Execution Phase:-
        1. Variable Initilization
        2. Output statemnet(console.log())
        3. Function call statement

<!-- Day-9 -->
# Hoisting:-
    1. The ability of js engine to access a variable before its declaration statement is known as Hoisting.
    2. Variable declared with var, let and const, function supports hoisting.
    3. Hoisting is Javascript's default behavior of moving variables and function declarations to the top of their scope during the compilation(Variable) phase, before code execution.
    Explanation:- This means you can use functions before they're declared in your code, and variables declared with var are hoisted but initilized as undefined until their actual assigment is reached. However, let and const declarations are hoisted but remain in a
    "temporal dead zone" and cannot be accessed before their declaration line.
# Temporal Dead Zone(TZD):-
    1. It is the time frame between variable declaration and variable initilization in this time frame we can not access a variable.
    2. Variable declared with let and const belongs to Temporal Dead Zone.
    3. TDZ starts when the scope (block/function) is entered.
    4. TDZ ends when the actual variable declaration line is executed.
    5. After that variable can be used normally.

<!-- Day-10 -->
# Scope Chaining:-
    ==> What is Scope Chaining?
        -> JavaScript looks for variables from inside to outside until found.
        -> When a variable is referenced, javascript searches the current scope first, then moves up through parent scopes in a chain until the variable is found or the global scope is reached.
    ==> what is Lexical Scope?
        -> Variables are available where they are written in the code.
        -> The scope of a variable is determined by its position in the source code where inner functions have access to variables declared in their outer scope.

<!-- Day-11 -->
# Functions in JavaScripts:-
    -> Function is a object.
    -> A block of code which is used to perform some specific task.
    -> A function get executed only when it is called.
    -> To call a function we need function reference and paranthesis.
    -> The name of a function is a variable which holds function reference.
    -> The variable declared in function definition is known as parameters.
    -> The values passed during function call is known as arguments.
    -> Function can be hoisted and doesn't belong to Temporal Dead Zone(TDZ)
    -> Syntax:-     function sayHello(){
                console.log("Hello Devs.)
                }
                // To call a function:-
                SayHello()

    ==> Types of Functions:-
        -> Functions declaration statement, function statement
        -> Function as Expression/ Expression function/ first class function
        -> Immediately invoked function expression (IIFE).
        -> Arrow Function(=>)
                        - Implicit return type
                        - Explicit return type
        -> Higher Order Function (HOF).
        -> Callback Function(CF).
        -> Annonymous Function:- A function which doesn't have any name.

    1. Functions declaration statement, function statement:-
            function greet(user){
                console.log(`Good Morning ${user}`)
            }
            greet("Hello")
                
    2. Function as Expression/ Expression function/ first class function:-
            const greet = function(user){
                        console.log(`Hello ${user}`)
                    }
                    greet("Jolly")

    3. Immediately invoke function expression (IIFE):-
            let x = (function greet(user) {
            console.log(`Hello ${user}`);
            return function greet2(){
                    console.log("It's Bad Day");
            }
            })((greet = "Jhonny"));
            console.log("x", x);

    4. Arrow Function(=>)
        a. Implicit return type:-
        Example:-
                        const findSum = (a,b)=> a+b;

                        const y = findSum(10,20);
                        console.log("x ", x);
        Example:-
                        const product = (a,b) => a*b;
                        const y = product(5,5);


        b. Explicit return type:-
        Example:-
                    const findSum = (a,b)=>{
                        const total = a+b;
                        console.log("total:", total)
                        return total;
                    }
                    const x = findSum(10,20);
                    console.log("x ",x)
        Example:-
                    const findPower(a,b)=>{
                        const pow = a**b;
                        console.log(pow);
                        return pow;
                    }
                    const x = findPower(5,2)
                    console.log(x)

    5. Higher Order Function (HOF):-
        1. The function which accepts another functuion as an argument.
        2. The function which return another function.
    6. Callback Function(CF):-
        1. The  function which is passed to another function as an argument.
        2. The function which is returned by another function.

# Closure:- A closure is a function that has access to to variables from its outer(enclosing) function's scope, even after the outer function has finished execution. This happens because the inner function maintains a reference to the outer function's variables. Closures are created every time a function is crreated in javascript, allowing for data privacy and maintaining state.

    # DrawBacks of closure:-
        1.High memory consumption:- everytime you call a function a new fresh closure is created.

Q) Difference Between Undefined and Not defined ?

<!-- Day-12 -->
# =============================================================================================================================================
# Arrays:-

    1. Empty Array = []
    2. Array with literals = [10,20,30,"hello", true, null ] 
    3. with new keyword and Array Contructor
    Example:
        const arr1 = [10,20,30];
        const arr2 = new Array(10);

/** Important Array Methods:
 *  - push
 *  - pop
 *  - shift
 *  - unshift
 *  - slice
 *  - splice
 *  - reverse
 *  - indexOf
 *  - includes
 *  - concat
 *  - sort
 *  - forEach
 *  - map
 *  - reduce
 *  - reduceRight
 *  - filter
 *  - join
 *  - some
 *  - every
 *  - find
 *  - findLast
 *  - findIndex
 *  - findLastIndex
 *  - flat
 *  - Array.from
 *  - Array.isArray
 */

    Splice(a,b,c) where a = start index, b=No of elements to be deleted, c=new values to be added.
    Functionality:- 1. Insertion, 2. Deletion, 3.Updation.
    
    ==> Difference between slice and splice?
        --> Slice():- Extracts a portion of an array/string into a new array/string without modifying the original.
        --> Splice():- Adds, removes, or replaces elements directly in an array,, modifying the original array.
        --> Key difference:- Slice() is non-mutating (returns a copy), while splice() mutates the original array.
    
    ==> Difference betweeen indexOf() and includes():
        --> IndexOf(): Returns the first index position where a specified element is found in an array/string, or -1 if not found.
        --> includes(): Returns a boolean (true/false) indicating whether an array/string contains a specified element.
        --> key difference: indexOf() gives you the position, while includes() gives you a yes/no answer.
    
<!-- 16 dec -->
    # Higher Order Function #
    ==> sorting:
        --> The sort() method arranges elements of an array in ascending order by default (alphabetically for strings, numerically for numbers). It modifies the original array in-place and returns the sorted array.

    ==> forEach(callback):
        --> forEach is Higher Order Function
        --> It returns undefined
    ==> Difference between map() and forEach()?
        --> forEach():- A method that executes a provided function once for each array element. It returns undefined and is used for side effects (like logging or modifying external variables).
        --> map():- A method that creates and returns a new array by transforming each element using a provided function. The original array remains unchanged.
        --> Key Difference: forEach() performs actions without returning anything(undefined), while map() returns a new transformed array.

<!-- 19-dec-2025 -->
# What is map and filter function and what is their difference ?
-> MAP: Transforms each element in an array and returns a new array of the same length.
-> FILTER: Returns a new array containing only elements that pass a condition (can be shorter than original).
->Difference: Map changes values, filter selects values.

<!-- 22 dec -->
- reduce()

<!-- 23 dec -->
exam

<!-- 24 dec -->
# Object: Object is a collection of Key:Value pairs. It stored entries in {}.

_Important Object methods:_
    1) Object.keys(obj)
    2) Object.values(obj)
    3) Object.entries(obj)
    4) Objeect.fromEntries(iterable)
    5) Object.assign(target, ...sources)

_Destructuring:_ It is a shorthand syntax to extract values from arrays or objects directly into variables, 
    like const {name, age} = user or const [a, b] = array.588
_________________________________________________________________________________________________________________________________
        
<!-- 5 jan -->
# DOM: 
<!-- [07-01-26] -->
# HTMLCollections in NodeList:
  !HTMLCollection:
    -> Only Contains element nodes (HTML elements)
    -> Live collection - automatically updates when DOM changes
    -> Access by index or element name/id
    -> Methods item(), namedItem()
    -> Returned by: getElementsByClassName(), getElementbyTagName(), children.

  !NodeList:
    -> Contains any type of nodes (elements, text,comments, etc)
    -> Can be static or live depending on how it`s created
    -> Static querySelectorAll() - doesn`t update with DOM changes.
    -> Live-ChildNodes - updates automatically.
    -> Methods - item(), forEach(), entries(), keys(), values().


Google Backend
    JSON Placeholder
    Fake JSON

<!-- 21 Jan -->
# Throttling: Executes a function at most once every X milliseconds, no matter how many times it's called.
# Debouncing: Executes a function only after it stops being called for X milliseconds.