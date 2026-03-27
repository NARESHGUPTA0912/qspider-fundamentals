export const pow = (a,b)=> {
    const result = a**b;
    console.log("result:",result);
    return result;
}

export const divide = (a,b)=> {
    const div = a/b;
    console.log("div:",div);
    return div;
}

export const sayHello = (user)=> {
    console.log(`Hello ${user}`);
}

// multiple per file