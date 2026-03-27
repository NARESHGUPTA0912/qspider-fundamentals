const grandparentDiv = document.querySelector(".grandparent")
const parentDiv = document.querySelector(".parent")
const childDiv = document.querySelector(".child")

/**
// capturing phase
grandparentDiv.addEventListener("click",()=>{
    console.log("Grand Parent Clicked..!");   
},true)

// capturing phase
parentDiv.addEventListener("click",(e)=>{
    console.log("Parent Clicked..!",e.target);   
},true)

// capturing phase
childDiv.addEventListener("click",()=>{
    console.log("Child Clicked..!")
},true)
 */


// bubling phase
grandparentDiv.addEventListener("click",()=>{
    console.log("Grand Parent Clicked..!")
},false)

// bubling phase
parentDiv.addEventListener("click",(e)=>{
     e.stopPropagation();
    console.log("Parent Clicked..!")
},false)

// bubling phase
childDiv.addEventListener("click",()=>{
    console.log("Child Clicked..!");
   
},false)