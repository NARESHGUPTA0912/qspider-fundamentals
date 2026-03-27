/**
 * ! Example-1
 
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
    var d = 400;
    console.log("Inside a Block");
    console.log("a:",a);
    console.log("b:",b);
    console.log("c:",c);
    console.log("d:",d);
}
console.log("a:",a);
console.log("b:",b);
console.log("c:",c);
console.log("d:",d);
console.log("end");
 */


/**
 * ! Example-3
 */


console.log("start");
var a = 10;
let b = 20;
const c = 30;
{
    var a = 100;
    let b = 200;   
    console.log("Inside Block-1");
    console.log("a:",a);
    console.log("b:",b);
}

{
     const c = 300;
     var d = 400;
      console.log("Inside Block-2");
     console.log("c:",c);
     console.log("d:",d);
}

console.log("Outside a Block");
console.log("a:",a);
console.log("b:",b);
console.log("c:",c);
console.log("d:",d);
console.log("end");

