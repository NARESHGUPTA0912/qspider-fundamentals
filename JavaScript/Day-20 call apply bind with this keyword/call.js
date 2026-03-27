/**
 * ! call(obj , arg1 ,arg2, arg3 ........ arg-n)

const user = {
    username: "Chombu",
    age: 21,
    city: "Shahdara"
}

function pow(state,country,dis,pin){
    console.log("this in regular function:",this);
    console.log("state:",state);
    console.log("country:",country);
    console.log("district:",dis);
    console.log("pincode:",pin);
}

pow.call(user,"Delhi", "India","Ramnagar", 110032);
 */


/**
const user = {
    username :"Tinku",
    age: 24,
    outer: function outer()
            {
                console.log("this in outer:", this); // outer this = user 

                function inner() 
                {
                    console.log("this in inner:", this);
                }

              inner.call(this);
            }
}

user.outer();
 */



const user = {
    username:"Mark",
    email : "mark@gmail.com",
    age:36
}

// Regular Function
function greet(country,state,company){
    console.log("this:",this);
    console.log("country:",country);
    console.log("state:",state);
    console.log("company:",company);
}

// greet.call(user,"USA","New York","meta")
// greet.apply(user,["USA","New York","Meta"])
const x = greet.bind(user,"USA","New York","meta");
const y = greet.bind(user,"India","UP","Qspider")
console.log("x:",x);
x()

