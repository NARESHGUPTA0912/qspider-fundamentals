/**
 * ! slice: It returns a new array
const skills = ["java","html","css","js","spring"];
//                 0      1     2     3      4  
const arr = skills.slice(1,4)
console.log("arr:",arr);
 */

/**
 * ! splice:- original array
const arr = [10,20,300,400,50];
const x = arr.splice(2,2,30,40);
console.log("arr:",arr);
console.log("x:",x); 
*/

/**
 * ! forEach
 * ! map:- It is used to transform the array elements

const arr = [10,20,30,40,50];

const x = arr.map((element) =>
                {
                      if(element > 30)
                        {
                           return  element * 10 
                      }

                    
                } );

console.log("x:",x);
 */

/**
 * ! filter(callback) :- It works on condition and returns a filtered array

const arr = [10,20,30,40,50];

const x = arr.filter((element) =>
                 {
                    if(element > 30)
                    {
                        return element * 10;
                    }

                })

console.log("x:",x)

// falsy:- false, 0, null, undefined, 0n, Nan, "", 0.0
 */

/**
 * ! reduce(callback, initial value)
 * ! callback = (acc,element) => {}
 * ! initial value = []
 */

const arr = [10,20,30,40,50];

const x = arr.reduce((acc,element) =>
                    {
                        if(element > 30)
                        {
                            acc.push(element * 10); 
                        }
                        
                        return acc;
                       
                    }, []);

console.log("x:",x);