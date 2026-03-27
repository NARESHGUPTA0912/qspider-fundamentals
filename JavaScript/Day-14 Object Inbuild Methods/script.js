/**
 * ! Important Object Inbuild Methods 
 * - Object.keys()
 * - Object.values()
 * - Object.entries()
 * - Object.fromEnteries()
 * - Object.assign()

const obj1 = {
    fullname : "Chombu Singh",
    email :"chombu@gmail.com",
    password:"chombu123",
    age:24,
    gender: 'male'
}

const keys = Object.keys(obj1);
console.log("keys:",keys);
// keys = ["fullname", "email", "password", "age", "gender"]

console.log(keys.includes("password"))


const obj1 = {
    fullname : "Chombu Singh",
    email :"chombu@gmail.com",
    password:"chombu123",
    age:24,
    gender: 'male'
}

const val = Object.values(obj1);
console.log("val:",val);
// val = ["Chombu Singh", "chombu@gmail.com", "chombu123", 24, 'male' ]
*/


/**
const obj1 = {
    fullname : "Chombu Singh",
    email :"chombu@gmail.com",
    password:"chombu123",
    age:24,
    gender: 'male'
}

const arr = Object.entries(obj1);
const newObject = Object.fromEntries(arr)
console.log("arr:",arr);
console.log("newObject:",newObject);

 arr = [ 
         ["fullname","Chombu Singh"], 
         ["email","chombu@gmail.com"], 
         ["password","chombu123"],
         ["age",24],
         ["gender", 'male']
        ]


 newObject = {
    fullname : "Chombu Singh",
    email :"chombu@gmail.com",
    password:"chombu123",
    age:24,
    gender: 'male'
}
 */


/**
 * ! Object.assign(target,source1, source2, source3 ......... source-n)


const user = {
    fullname: "Tinku Singh",
    age: 24,
    city: "Noida"
}

const company = {
    companyName: "xyz infotech",
    address:"B-04, sector-03 Noida"
}

const hiring = {
    designation: "Fullstack Developer",
    package: "4LPA",
    city:"Delhi"
}

const employee = Object.assign({},user, company, hiring);
console.log("employee:",employee);
 */