/**
 * ! First way
    const changeText = () => {
        const h1 = document.getElementById("heading");
        h1.textContent = "Namaste Developers..!";
        h1.style.color="red";
    }


    const changeBg = (e) => {
        console.log(e.target)
        e.target.style.background="crimson";
    }
*/

/**
 * ! Second Way


const button = document.querySelector("button");

button.onclick = function changeText() {
    const h1 = document.getElementById("heading");
    h1.textContent= "Ndfghjkjhgfdsdfghjkkjhgfdscvbnm";
}


const div = document.querySelector("div");
div.onmouseover = (e) => {
    e.target.style.background = "blue";
}
 */

/**
 * ! addEventListener()



const button = document.querySelector("button");

button.addEventListener("click", function changeText(){
    const h1 = document.getElementById("heading");
    h1.textContent= "Namaste Javascript!!";
})


const div = document.querySelector(".container");

div.addEventListener("mouseenter", () => {
    console.log("Mouse Enter")
    div.style.background = "violet";
})

div.addEventListener("mouseleave",() => {
    console.log("Mouse Leave");
    div.style.background="#b5b3b3";
})
     

const button = document.querySelector("button");

button.addEventListener("dblclick", (e) => {
    console.log("Event Object e:",e);
})
    */


