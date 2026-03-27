const power = (a,b)=> {
    const pow = a**b;
    console.log("pow:",pow);
}

const multiply = (a,b)=> {
    const res = a*b;
    console.log("result:",res);
}

const sub = (a,b)=> {
    const subtract = a - b;
    console.log("subtract:",subtract);
}

module.exports = {
    power,
    multiply,
    sub
}