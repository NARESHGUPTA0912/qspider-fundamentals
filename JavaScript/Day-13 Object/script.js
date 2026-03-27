/**
const obj1 = {
    fullname: "sid",
    age:23,  
    bio: "Killer Boy"
};

// insertion in object
obj1.country = "India";

// Updation in object
obj1.age = 28;

// deletion in object
delete obj1.bio;

// search a key inside an object
console.log("fullname" in obj1 );

console.log(obj1);
 */

/**
 * ! Object Methods
 */

const obj1 = {
    fullname : "Chombu Singh",
    greet : function abc(){
                console.log("Good Morning..!")
                return "Hii";
            },
    sayHello : (user)=> console.log(`Hello ${user}`),
    skills: ["Frontend", "Backend"],
    address: {
        city:"Noida",
        state:"UP",
        pinCode: 201301
    }
}

const x = obj1.greet();
const y = obj1.sayHello("Ritesh");

console.log("x:",x);  // Hii
console.log("y:",y);  // Undefined
console.log(obj1.address.state)