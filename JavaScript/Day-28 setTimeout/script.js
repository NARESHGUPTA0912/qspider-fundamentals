/**console.log("start");

setTimeout(()=>{
    console.log("Async Task-1");

     setTimeout(() => {
         console.log("Async Task-1.1");
    }, 0);

}, 2000)

setTimeout(()=>{
    console.log("Async Task-2");

    setTimeout(() => {
         console.log("Async Task-2.1");
    }, 0);
}, 1000)

console.log("End");


 * start
 * Your Order is arrived..!
 * End
 * 
 * 
 * start
 * end
 * Your Order is arrived..!
 * 1s =1000

const timeoutId = setTimeout(() => {
    console.log("Async Task");
}, 500);

console.log("timeoutId:",timeoutId);
 */

/**
 * ! setInterval
 */

console.log("start");

let count = 1;
let id;

id = setInterval(()=>{
    console.log("count:",count++);
},1000);

setTimeout(() => {
    clearInterval(id);
}, 1000*5);

console.log("end");