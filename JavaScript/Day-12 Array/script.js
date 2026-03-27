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
 * ! - forEach(callback)
 * ! - map(callback)

const arr = [1,2,3,4,5];
const output = [];

const r1 = arr.forEach((element,index,array) => {
                        output.push(element * 100);
                        return element;
                    })

const r2 = arr.map((element,index,array) => {
                        output.push(element * 100);
                        return element;
                    })

console.log("output:",output);
console.log("arr:",arr);
console.log("forEach r1:",r1);
console.log("map r2:",r2);
 */



// const arr = [1,2,3,4,5];
// const output = arr.map((element,i) => element+i  )
// console.log("output:",output);



/**
 * ! - filter(callback)
const arr2 = [10,20,30,40,50];
const x = arr2.filter(element => {
                                if(element > 50)
                                {
                                    return true;
                                }

                    });

// map = [undefined, undefined ,undefined, 40, 50]
// filter = [10,20,30]
console.log("x:",x);
 */

/**
 * ! - reduce(callback, initial value)  
 * acc = accumulator


const arr = [10,20,30, 40, 50];

const result = arr.reduce((acc,element)=>{
            if(element > 30)
            {
                acc.push(element * 10)
            }
            return acc;
        },[])

console.log("result:",result);
 */

/**
 * ! - filter by price
 * ! - filter by category and price


const cart = [ 
    {
        itemName:"Hoddie ",
        price:2999,
        category:"Winter cloths"
    },
    {
        itemName:"Airpods",
        price:24000,
        category:"Electronics"
    }, 
    {
        itemName:"Leather Jacket",
        price:5999,
        category:"Winter cloths"
    },
    {
        itemName:"Mac Book",
        price:92999,
        category:"Electronics"
    }
    
]

const filteredItem1 = cart.filter(element => {
    if(element.price <= 50000){
        return true;
    }
    return false;
}).sort((a,b)=> a.itemName.charCodeAt(0) - b.itemName.charCodeAt(0));

const filteredItem3 = cart.filter(element => element.price <= 50000)
console.log("filteredItem1:",filteredItem1);
// filter = [ {price:24000}, {price:5999}, {price:2999}]
                        

// cart = [ {category: "Winter clothers"}, {}, {}, {}]
const filterByCategory = cart.filter(element => element.category.toLowerCase() === "electronics" )

console.log("filterByCategory:",filterByCategory);
 */



/**
 * ! - some()

const cart = [ 
    {
        itemName:"Hoddie ",
        price:2999,
        category:"Winter cloths"
    },
    {
        itemName:"Airpods",
        price:24000,
        category:"Accessories"
    }, 
    {
        itemName:"Leather Jacket",
        price:5999,
        category:"Winter cloths"
    },
    {
        itemName:"Mac Book",
        price:92999,
        category:"Laptop"
    },
    {
        itemName:"Electric Induction",
        price:11999,
        category:"Electronic"
    }    
]

const result = cart.some(element => {
                    if(element.category.toLowerCase() === "accessories"){
                        return true   
                    }
                    return false;
                })

console.log("result:",result);
 */


/**
 * ! - every()


const emp = [
    {
        fullname:"Tinku",
        des : "Developer"
    },
    {
        fullname:"Cheeku",
        des : "Developer"
    },
    {
        fullname:"Dinga",
        des : "Manager"
    },
    {
        fullname:"Sid",
        des : "Developer"
    }
]

const isDeveloper = emp.every(element => {
    if(element.des.toLowerCase() === "developer"){
        return true;
    }
    return false;
})


console.log("isDeveloper:",isDeveloper);
 */

/**
 * ! - forEach
 */

const arr = [100,200,300,400,500];

const output = [];

arr.forEach(element=>{
         output.push(element/10)  
})

console.log(output);

/**
 * ! Array.isArray()

const x = [10,20];
const y = { name: "chombu"};
const z = "Javascript";

const res1 = Array.isArray(x);
const res2 = Array.isArray(y);
const res3 = Array.isArray(z);

console.log("res1:",res1);
console.log("res2:",res2);
console.log("res3:",res3);
 */

/**
 * ! Array.from()
 */
const y = { name: "chombu"};
const z = "Java";

const arr1 = Array.from(y);
const arr2 = Array.from(z);

console.log("arr1:",arr1);  // []
console.log("arr2:",arr2); // ['J', 'a', 'v', 'a']