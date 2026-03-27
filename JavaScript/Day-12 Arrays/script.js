/**
 * 1. Empty Array = []
 * 2. Array with literals = [10,20,30,"hello", true, null ] 
 * 3. with new keyword and Array Contructor
 * 
 * const arr1 = [10,20,30];
 * const arr2 = new Array(10);
 */


/**
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

/** Example:- push, pop, shift, unshift
const arr = [100,10,20,30];
// arr.push(40,50);
// arr.pop()
arr.shift()
arr.unshift(5)
console.log(arr)
 */

/**
 * ! Example:- slice(a,b)    a= start index, b= last index


const skills = ["java","spring","sql","html","css","js","react", "hibernate"];
            //    0       1       2      3     4     5     6         7
const frontendSkills = skills.slice(3,7)
console.log("frontendSkills:",frontendSkills);
 */

/**
 * ! Example:- splice(a,b,c)
 *  a = start index
 *  b = no of elements to be deleted
 *  c= new values to be added
 

const arr = [10,2,200,30,4,400,50];

const x = arr.splice(1,2,20);
const y = arr.splice(3,2,30);

console.log("x:",x); // [2,200]
console.log("y:",y); // [4,400]
console.log("arr:",arr); // [10,20,30,40,50]


const arr = [10,200,30,400,50];

const x = arr.splice(1,3,20,30,40)
console.log("arr:",arr);
console.log("x:",x); 
*/

/**
 *  - reverse()
 *  - indexOf(search value,start index) => index number || -1
 *  - includes(search value,start index) => true || false
 
const arr = [10,20,30,40,50];
const x = arr.indexOf(20,2);
const y = arr.includes(20,2);

console.log("x:",x); // -1
console.log("y:",y)  // false
 */


/**
 * - concat
 *  [10,20,30] + [40,50,60] => [10,20,30,40,50,60]

const arr1 = [10,20,30];
const arr2 = [40,50,60];

const x = arr1.concat(arr2);
console.log("x:",x);
 */

/**
 * ! sort()
 


const arr = [10,4,8,9,3,6,2,7,5,1,2];
arr.sort((a,b)=> a - b);
console.log("arr:",arr);


const products = [
    {
        itemName:"wow momos",
        price:170,
        rating:4
    },
    {
        itemName:"boost",
        price:336,
        rating:4.5
    },
    {
        itemName : "Maggie 560g",
        price:116,
        rating:4.8
    },
    {
        itemName: "Amul Chocominis",
        price:127,
        rating:3
    }
]


// products.sort((a,b) => a.price - b.price); 
products.sort((a,b) => b.rating - a.rating); 

console.log("products low to hight sort:",products);
*/

/**
 * forEach
 * map
 * filter
 * reduce
 */
/**
 * 
const arr = [1,2,3,4,5];
const output = [];

const returnValue = arr.forEach((element, index, array) => {
    //console.log("index:", index,"element:",element);
    output.push(element * 100);
})
const returnValue2 = arr.map((element, index, array) => {
    //console.log("index:", index,"element:",element);
    output.push(element * 100);
})

console.log("output:",output);
console.log("arr:",arr);
console.log("forEachreturnValue:",returnValue);
console.log("mapreturnValue2:",returnValue2);
*/


//--------------------------------------------------------------------------------------

/* const arr =[1,2,3,4,5];
// const output = arr.map((element) => {
//     return element * 10; // Math.pow(element,2);
// })

// console.log("output:",output);
// if we return hard coded data and every iteration of fun it return same value so in the end it return number of time ssame value.
// map = [1,4,9,16,25]

// const arr =[1,2,3,4,5];
// const output = arr.map( element => element + 10);
// console.log("output:",output);


// const arr =[1,2,3,4,5];
// const output = arr.map( (element,i) => {
//     return element+i });
// console.log("output:",output);

// if we want to change every value then we used map()

const arr2 = [10,20,30,40,50];

const x = arr2.map(element => {
    if(element > 30){ // , [undefined, undefined, 40, 50] // undefined is falsy value which can map stores but filter() not.
        return element;
    }
});

console.log("arr2:",arr2);
console.log("x:",x);

*/

/*
// if we want to apply conditions on value then we usse filter because filter() can not stores falsy value .

*/

const arr2 = [10,20,30,40,50];

const x = arr2.filter(element => {
    if(element < 30){ // , [undefined, undefined, 40, 50] // undefined is falsy value which can map stores but filter() not.
        return element;
    }
});
console.log("arr2:",arr2);
console.log("x:",x);

