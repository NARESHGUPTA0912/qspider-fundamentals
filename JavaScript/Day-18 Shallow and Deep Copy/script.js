/**
 *  ! 1. Shallow Copy
const jack = {
    cake:"Strawberry Cake",
    bike: "David Putra"
}

const oggy = jack;
delete oggy.cake;
console.log("oggy:",oggy);
console.log("jack:",jack);
 */


/**
 * ! Deep Copy with structured clone

const jack = {
    cake:"Strawberry Cake",
    bike: "David Putra"
}

const oggy = structuredClone(jack);
oggy.bike = "Pink scooty";

console.log("oggy:",oggy);
console.log("jack:",jack);
 */

/**
 * ! Deep copy without structured clone 
 * ! using spread operator ...jack
 */
const jack = {
    cake:"Strawberry Cake",
    bike: "David Putra",
    nickName: {
        name1: "fauji",
        name2: "Bhaiya"
    }
}

// const oggy = { ...jack, bike: "Pink Scooty"}
const oggy = structuredClone(jack);
oggy.gf = "olly";

oggy.nickName.name1 = "Billa";
oggy.nickName.name2 = "Billi";

console.log("oggy:",oggy);
console.log("jack:",jack);

