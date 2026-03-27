// ! Object Destructuring
const user = {
    fullname:"chombu singh",
    email:"chombu@gmail.com",
    age:24
}

const {fullname,age} = user;
console.log("fullname:",fullname);
console.log("age:",age);

/**
 * ! Array Destructuring
 */
const skills = ["HTML", "CSS", "JS", "React"];
const [a, , , d] = skills;
console.log(a);
console.log(d);


