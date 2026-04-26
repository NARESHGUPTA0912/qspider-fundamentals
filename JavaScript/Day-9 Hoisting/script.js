console.log(a); // uncaught referance error: can't access lexical declaration 'a' before initialization

let a=10;

// var a;   dec comes at top by var phase  
console.log(a);   //-[----]> undefined  
    a=20;
console.log(a);
    a=10;  // declaration line

// let b        TDZ start
b= 30;
console.log(b);
b=20;
console.log(b); 

---------------------------------------------

/**
// var a 
console.log(a);  // -----> undefined
    a = 20;
console.log(a); // 20
    a = 10;        // Declaration Line
 */

  
/* let b                     TDZ start
      b = 30;
console.log(b);
      b = 20;              // TDZ End
console.log(b);
*/


/* Question-1
console.log("start");
let a = 10;
{
  console.log(a);
  let a = 10;
}
console.log(a);
console.log(b);
console.log("end");
*/

/* Question-2
console.log("start");
let a = 10;
{
  let a = 100;
    b = 200;
  console.log(a);
  console.log(b);
}
let b = 20;
console.log(a);
console.log(b);
console.log("end");
*/