/**
 * ! Hoisting:-
 * 1. The ability of js engine to access a variable before its declaration statement is known as Hoisting.
 * 
 * 2. Variable declared with var, let and const, function supports hoisting.
 * 
 * 3. Hoisting is JavaScript's default behavior of moving variable and function declarations to the top of their scope during the compilation phase, before code execution. (for interview answer)
 * 
 * ! Explanation:-
 *  This means you can use functions before they're declared in your code, and variables declared with var are hoisted but initialized as undefined until their actual assignment is reached. However, let and const declarations are hoisted but remain in a "temporal dead zone" and cannot be accessed before their declaration line.
 */


/**
 * ! Temporal Dead Zone (TDZ) :-
 * 1.  It is the time frame between variable declaration and variable initialization in this time frame we can not access a variable.
 * 
 * 2. variable declared with let and const belongs to Temporal Dead Zone.
 * 
 * 3. TDZ starts when the scope (block/function) is entered.
 * 
 * 4. TDZ ends when the actual variable declaration line is executed.
 * 
 * 5. After that variable can be used normally.
 */

