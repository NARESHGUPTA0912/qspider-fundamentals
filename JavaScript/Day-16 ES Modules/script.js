import anything from "./A.js";
// import {pow as power,divide, sayHello} from "./B.js";

import * as chombu from "./B.js"

console.log(anything);
const {pow,divide,sayHello} = chombu;
console.log("power:",pow);
console.log("divide:",divide);
console.log("sayHello:",sayHello);