/**
 * ! Rest Operator
const user = {
    firstName : "Tinku",
    lastName: "Singh",
    email: "tinku@gmail.com",
    password: "tinku@123",
    age:26,
    isWorking: true,
    skills: ["React","Angular"]
}

const {email, ...userCollection} = user;

console.log("Email:",email);
console.log("User Collection:", userCollection);
console.log("user:",user)


// ! Rest Parameterised Function
// items = [10,20,30,40,50,60,70,80,90,100]
const sum = (...items) => {  
    console.log("items:",items);
    const total = items.reduce((acc,element)=> acc + element, 0);
    return total;
}

const x = sum(10,20,30,40,50,60,70,80,90,100);
console.log("x:",x);
 */

/**
 * ! Spread Operator
 */

const jack = {
    cake: "Chocolate cake",
    bike: "David Putra",
    dialog: {
        d1: "Tod dunga fod dunga"
    }
}

const oggy = { ...jack };

oggy.bike = "Pink Scooty";
oggy.dialog.d1 = "Chorunga nahi";

console.log("oggy:",oggy);
console.log("jack:",jack);