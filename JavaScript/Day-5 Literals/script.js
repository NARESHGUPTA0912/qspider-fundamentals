/**
 * ! Literals:- Literals are different types of values that is used in writing a program.
 * 
 * ! Types of Literals:- 2 types
 *   1. Primitive Literals:- 
 *          - Primitive values are sinle valued literals.
 *          - Primitive literals are immutable (can not change).
 *          - Types of Primitive Literals :- 8 types
 *                 i) number  ii) bigInt  iii) Nan  iv) boolean  v) null
 *                vi) undefined vii)string  viii) symbol
 *   
 *  2. Non Primitive Literals:-
 *          - Non primitive literals are multi valued literals.
 *          - Non primitive literals are mutable (can change).
 *          - Types of Non Primitive Literals:- 
 *              i) Function ii) Array  iii) Object     
 */


// number :-   floating or integer (-ve or +ve)
const a = -0.5;

// bigInt :- -infinity    to    +infinity
const b = 1n;


/**
 * ! Nan :- Nan stands for Not a Number
          It is computational error given by js engine.

          "10"    ------>   10
          "10x"   ------>   Nan (number)

const x = 10;
const y = "5abc";

console.log(x - y);  // Nan
console.log((x - y) * 5);   // Nan
*/

/**
 * ! Boolean:- True or Truthy | false or falsy
 * 
 * falsy:- 0, 0n, 0.0, null, Nan, undefined, ""
 */

/**
 * ! diff between null and undefined
 */

const m = null; // stored intentionally by developer

let n;         // stored by js engine   n = undefined

/**
 * String:- Collection of characters
 * ! 1. Single Valued String:- "", ''
 * ! 2. Multi valued String or Template string: - `Backtick`
 * 
 * ! Interview question: what is Template String?

const user = "Ankit";
const age = 21;

const msg = `username ${user} and age ${age}`;

console.log(msg);
 */

/**
 * ! 5. Punctuators:-
 *  1. Group:- (),[],{}
 *  2. speparate:- comma(,) or semi-colon(;)
 *  3. inside object:- Dot(.)
 */

const arr = [10 , 20,30];
const obj = {username: "Raj"};
console.log(obj.username)


                
