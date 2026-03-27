/**
 * ! Without Event Delegation
 
const button1 = document.querySelector(".c1 button");
const button2 = document.querySelector(".c2 button");
const button3 = document.querySelector(".c3 button");


button1.addEventListener("click",(e)=>{
    const card = e.target.closest(".card");
    const h3 = card.querySelector("h3");
    console.log(h3.textContent);
})

button2.addEventListener("click", (e)=>{
        const card = e.target.closest(".card");
        const h3 = card.querySelector("h3");
        console.log(h3.textContent);
})

button3.addEventListener("click", (e)=>{
        const card = e.target.closest(".card");
        const h3 = card.querySelector("h3");
        console.log(h3.textContent);
})
*/

/**
 * ! With Event Delegation
 */

const centerContainer = document.querySelector("#hero .centerContainer");


centerContainer.addEventListener("click", (e)=>{
    e.stopImmediatePropagation();
    const card = e.target.closest(".card");
    const msg = card.querySelector("h3").textContent;
    console.log(msg);
})