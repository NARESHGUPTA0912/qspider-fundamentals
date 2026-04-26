// JSON = Javascript Object Notation
const user = {
    username: "Elon Musk",
    email: "elon@gmail.com",
    password: "elon#123",
    age:51
}
const jsonData = JSON.stringify(user, null, 4);
console.log("jsonData:",jsonData);
const backToJs = JSON.parse(jsonData);
console.log("backToJs:",backToJs);