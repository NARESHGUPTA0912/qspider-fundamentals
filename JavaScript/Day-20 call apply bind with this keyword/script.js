/**
 * 1. this in GEC = window
 * 2. this in Named function = window
 * 3. this in Arrow function = window
 * 4. this in object inside Named Method = object
 * 5. this in object inside Arrow Method = window 
 */

/** 
console.log("this in GEC:",this)

function sum(){
    console.log("this in named fn",this)
}
sum()

const pow = () => console.log("this in Arrow fn:",this);
pow()
*/

/**
 * ! 4. this in object inside Named Method = object
 * ! 5. this in object inside Arrow Method = window


const obj = {
    fullname: "chombu",
    age: 26,
    city: "Noida",
    sayHello: function()
    {
        console.log("this in named Method:",this)
    },
    greet: () => {
        console.log("this in Arrow Method:",this);
    }
}

obj.sayHello()
obj.greet();
 */

/**
 * ! 6. this keyword inside object inside nested methods
 *     i) Outer regular function: this refers to the object that called the method.
      ii) Inner arrow function: this inherits from outer function, so it also refers to the same object.
 */

const user = {
    username :"Tinku",
    age: 24,
    outer: function outer()
            {
                console.log("this in outer:", this);

                const inner = () =>
                {
                    console.log("this in inner:", this);
                    test()
                }
              inner();
            }
}
user.outer();

