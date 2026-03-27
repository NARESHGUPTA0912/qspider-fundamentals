const sum = (a,b)=> {
    const total = a + b;
    console.log("total:",total);
    return total;
}

const sub = (a,b)=> {
    const subtraction = a + b;
    console.log("subtraction:",subtraction);
    return subtraction;
}

export default { sum, sub};  // one per file