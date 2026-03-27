"use strict"

/** Example-1
console.log("start");
var a = 10;
let b = 20;
const c = 30;
console.log("a:",a);
console.log("b:",b);
console.log("c:",c);
console.log("end");
 */

/**
 * ! Example-2
console.log("start");
var a = 10;
let b = 20;
const c = 30;

{
    var a = 100;
        let b = 200;
        const c = 300; 
        console.log("Inside a Block");
        console.log("a:",a);
        console.log("b:",b);
        console.log("c:",c);
    }
    
    console.log("outside a Block");
    console.log("a:",a);
    console.log("b:",b);
    console.log("c:",c);
    console.log("end");
*/

/**
 * ! Example-3

console.log("start");
var a = 10;
let b = 20;
const c = 30;

    {
        var a = 100;
              b = 200;
        const c = 300; 
        console.log("Inside a Block");
        console.log("a:",a);  // 100
        console.log("b:",b);  // 200
        console.log("c:",c);  // 300
    }

console.log("outside a Block");
console.log("a:",a);
console.log("b:",b);
console.log("c:",c);
console.log("end");
 */

/**
 * ! Example-4 Autoglobals

var a = 10;
let b = 20;

    {
        var a = 100;
            b = 200;
            c = 300;  // Initialization
        console.log("Inside a Block");
        console.log("a:",a);
        console.log("b:",b);
        console.log("c:",c);
    }
console.log("Outside a Block");
console.log("a:",a);
console.log("b:",b);
console.log("c:",c);
*/

/**
 * ! variable Shadowing
 */

var a = 10;

 {
    let a = "chombu";
    console.log("a:",globalThis.a);
 }

console.log("Outside a:",a);