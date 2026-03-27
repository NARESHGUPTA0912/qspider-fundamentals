var a = 10;
let b = 20;

{
    let c = 30;
    {
        const d = 40;
        console.log("a:",a)
        console.log("b:",b)
        console.log("c:",c)
        console.log("d:",d)
    }
    console.log("a:",a)
    console.log("b:",b)
    console.log("c:",c)
}

console.log("a:",a)
console.log("b:",b)