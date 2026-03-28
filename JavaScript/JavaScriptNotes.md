# Difference between async and defer?(claude.ai)

-> 1. async:- Downloads the script in parallel with HTML parsing, but executes immediately when
ready (pause HTML parsing), with no guaranteed executeion order between multiple async scripts.
-> 2. defer:- Downloads the script in parallel with HTML parsing, but executes only after
HTML parsing completes, maintaining the original order of scripts in the document.
-> 3. Use case: Use async for independent scripts(analytics, ads) and defer for scripts that depend
on the DOM or each other.

#   OPERATORS:-

==> Difference between loose equality (==) and strict equality(===) in 2 line?
    Loose equality(==): Compare values after type coercoin, coverting operands to the same before comparsion(eg, 5 == '5' = true)

    Strict equality(===)

==> Difference between loose not equality (!=) and strict not equality(!==) in 2 line?
    Loose inequality(!=):- returns true if value are different after coersion(5 != '5' = false).
    Strict inequality(!==) return true if the value are different after 

==>  Logical AND (&&):-

==> Logical OR(||):- 

 
# what is template String and what is string interpolation? :-(claude.ai)
    Template-String:-  A string notation in programming that allows embedding expressions and multi-line text. In javascript, it uses backticks(`) instead of quotes.
    StringInterpolation:- The process of inserting variable values or expressions directly into a string. It replaces placeholders with actual values at runtime.

# 5. Punctuators:- 
    1. Group:- (),{},[]
    2. separate:- comma(,), or semi-colon(:)
    3. inside object:- Dot(.)
 
    eg:-    const arr = [10, 20, 30];
            const obj = {username: "raj"};
            console.log(obj.username);

# Scope in javascript:-
    1. Global Scope:-
    2. Local Scope:-
        ->Block Scope
        ->Function Scope

# Variable Shadowing:- (keywords:- window, this, self, frames, (Node.js global) (standard:- globalThis))
    Example:-   var a = 10;
                {
                    let a = "KD";
                    console.log(a);
                    console.log(window.a)
                }

# Type coercion:- To convert one type of data into another type with the help of js engine is known as type coercion/ type conversion.
==> Types of type conversion:-
    1. Implicit Type Coercion:- To convert one type of data into another type by js engine automatically(impicitly) is known as Impicit Type coercion.

    2. Explicit Type coercion:- To convert on type of data into another type forcefully (Explicity) by js engine is known as Explicit type coercion.

    # Here we use inbuild functions to convertthe data form one type into another:
        primitive               Non-primitive
        Number()                Array()
        String()                Object()
        Boolean()               Set()
        BigInt()                Map()
        Symbol()

    ==> what is typeof Operator in javascript:- The typeof operator in js returns a string indicating the datatype of its operand(Variable, literal, or expression). It evaluates operands like numbers, String, booleans objects, functions, undefined symbols, and bigints, returning their type as string.
        example:- typeOf 42 = "number";

# GLOBAL EXECUTION CONTEXT(GEC):-

    1. Variable Phase:-
        1. Variable Declaration Statement
                var a  = 10;
                let b = 20;   

    2. Execution Phase:-
        1. Variable Initilization
        2. Output statemnet(consle.log())
        3. Function call statement

# Hoisting:-
    1. The ability of js engine to access a variable before it's declaration statement is known as Hoisting.
    2. Variable declared with var, let and const function supports hoisting.
    3. Hoisting is Javascript's default behavior of moving variables and function declarations to the top of their scope during the compilation(Variable) phase, before code execution.
        Explanation:- This means you can use functions before they're declared in your code, and variables declared with var are hoisted but initilized as undefined until their actual assigment is reached. However, let and const declarations are hoisted but remain in a 
        "temporal dead zone" and cannot be accessed before their declaration line.
# Temporal Dead Zone(TZD):-
    1. It is the time frame between variable declaration and variable initilization in this frame we can not access a variable.
    2. Variable declared with let and const belongs to Temporal Dead Zone.
    3. TDZ starts when the scope (block/function) is entered.
    4. TDZ ends when the variable declaration line is executed.
    5. After that variable can be used normally.

# Scope Chaining:-
    ==> What is Scope Chaining?
        -> JavaScript looks for variavles from inside to outside until found.
        -> When a variable is referenced, javascript searches the current scope first, then moves up through parent scopes in a chain until the variable is found or the global scope is reached.
    ==> what is Lexical Scope?
        -> Variables are available where they are written in the code.
        -> The scope od a cariavle is determined by its position in the source code where inner functions have access to variables declared in their outer scope.

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
        -> Immediately invoke function expression (IIFE).
        -> Arrow Function(=>)
                        - Implicit return type
                        - Explicit return type
        -> Higher Order Function (HOF).
        -> Callback Function(CF).
        -> Annonymous Finction:- A function which doesn't have any name.

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

# Closure:- A closure is a function that has access to to variables from its outer(enclosing) function's scope, even after the outer function has finished execution. This happens because the inner function maintains a reference to the outer function's variables. Closures are created every time a function is crreated in javascript, allowing for datat privacy and maintaining state.

    # DrawBacks of closure:-
        1.High memory consumption:- everytime you call a function a new fresh closure is created.

# =============================================================================================================================================
# Arrays:-
    Splice(a,b,c) where a = start index, b=No of elements to be deleted, c=new values to be added.
    Functionality:- 1. Insertion, 2. Deletion, 3.Updation.
    
    ==> Difference between slice and splice?
        --> Slice():- Extracts a portion of an arrays/string into a new array/string without modifying the original.
        --> Splice():- Adds, removes, or replaces elements directly in an array,, modifying the original array.
        --> Key difference:- Slice() is non-mutating (returns a copy), while splice() mutates the original array.
    
    ==> Difference betweeen indexOf() and includes():
        --> IndexOf(): Returns the first index position where a sprecified element is found in an array/string, or -1 if not found.
        --> includes(): Returns a boolean (true/false) indicating whether an array/string contains a specified element.
        --> key difference: indexOf() gives you the position, while includes() gives you a yes/no answer.
    
    # Higher Order Function #
    ==> sorting:
        --> The sort() method arranges elements of an array in ascending order by default (alphabetically for strings, numerically for numbers). It modifies te original array in-place and returns the sorted array.

    ==> forEach(callback):
        --> forEach is Higher Order Function
        --> It returns undefined
    ==> Difference between map() and forEach()?
        --> forEach():- A method that executes a provided function once for each array element. It returns undefined and is used for side effects (like logging or modifying external variables).
        --> map():- A method that creates and returns a new array by transforming each element using a provided function. The original array remains unchanged.
        --> Key Difference: forEach() performs actions without returning anything(undefined), while map() returns a new transformed array.

19dec-2025
# What is map and filter function and what is their difference ?
-> MAP: Transforms each element in an array and array  a new array of the same length.
-> FILTER: Returns a new array containing only elements that pass a condition (can be shorter than original).
->Difference: Map changes values, filter selects values.

[07-01-26]
# HTMLCollections in NodeList:
  !HTMLCollection:
    -> Only Contains element nodes (HTML elements)
    -> Live collection - automatically updates when DOM changes
    -> Access by index or element name id
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

commands:
1) 