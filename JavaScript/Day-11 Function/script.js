/**
 * ! Types of Function:- 
 *   1. Function Declaration Statement, Function Statement
 *   2. Function as Expression/ Expression Function/ First Class Function
 *   3. Immediately Invoked Function Expression (IIFE)
 *   4. Arrow Function (=>)
 *              - Implicit Return Type
 *              - Explicit Return Type
 *   5. Higher Order Function (HOF)
 *   6. Callback Function (CF)
 * 
 * 
 * - Annonymous Function:- A function which does not have any name
 */

/**
function greet(user="Amit")
{
    console.log(`Good Morning ${user}`);

    return [10,20,30];
}

const x = greet("Harsh");
console.log("x:",x);


function findSum (a,b)
{
    var add = a + b;
    console.log(`Sum of ${a} + ${b} is: ${add}`);
}

const x = findSum(10,20);
console.log("x:",x);
console.log("add:",add);
 */

/**
 * ! 1. Function Declaration Statement
function greet(user)
{
    console.log(`Good Morning ${user}`);
    return "Bla Bla.."
}

let x = greet("Shivam");
console.log("x:",x);
 */

/**
 * ! Function as Expression/ First class Function

const greet = function sayHello(user)
                {
                    console.log(`Hello ${user}`);
                    return "Bla Bla.."
                }

let x = greet("Shivam");
console.log("x:",x);
 */

/**
 * ! Immediately Invoked Function Expression (IIFE) - Annonymous Function

console.log("start");

let x  = (
                function meme1(user)
                {
                    console.log("Meme 1 Function");
                    debugger;
                    console.log(`${user} bhai Bulati h magar jane ka nhi..!`);

                    return function meme2(){
                        console.log("smjh rhe ho..")
                    }
                }
        )("Chombu");
 */

/**
 * ! Arrow Function (=>) ES6 2015

const findSum =  (a,b) => {
                    const total = a + b;
                    console.log("total:",total);
                    return total;
                }
                
const x = findSum(10,20)
console.log("x:",x);


const greet = (user) => console.log(`Good Morning ${user}`);

const z = greet("Jim");
console.log("z:",z);
 

const showDialog = ()=> (`Ghayal hu
islie hi
ghatak hu..!`);

const task = () => showDialog() ;

const msg = task()

console.log("msg:",msg);
*/


/**
 * ! Higher Order Function:-
 *  1. The function which accepts another function as an argument.
 *  2. The function which returns another function
 * 
 * ! Callback Function:-
 *  1. The function which is passed to another function as an argument.
 * 2. The function which is returned by another function.
 */

function calculator(a, task,b)
{
        console.log("Calculation start");
        const res = task(a,b);
        console.log("Calculation end");
        return res;
}

const sum = (m,n)=>m+n;

const x = calculator(10, sum ,5)
console.log("x:",x);