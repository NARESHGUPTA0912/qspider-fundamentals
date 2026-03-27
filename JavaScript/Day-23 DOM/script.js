// DOM APIs = set of properties or function

/**
 * ! document.head
const head = document.head;
head.innerHTML = `<style>
    body{
        background-color:black;
        color:white;
    }
</style>`
 */

/**
 * ! document.body
const body = document.body;
console.log("body:",body);
 */

/**
 * ! document.getElementById("value")

const h1 = document.getElementById("heading");
h1.style.cssText = `color:red;
background-color:#f0f0f0; 
font-size: 40px;
padding:5px;`;
    
// h1.style.color="red";
// h1.style.fontSize="50px";
// h1.style.padding="5px";
const div = document.getElementById("root"); 
div.style.color="blue";
 */

/**
 * ! document.getElementsByClassName()

// const paragraphs = document.getElementsByClassName("para");

// console.log("paragraphs:",paragraphs);

// HTML Collection(length = 4)  {
//        0: <p class="para p1">Paragraph Tag-1</p>
//        1: <p class="para p2">Paragraph Tag-2</p>
//        2: <p class="para p3">Paragraph Tag-3</p>
//        3: <p class="para p4">Paragraph Tag-4</p>
// }

// paragraphs[3].style.color="blue";
// paragraphs[0].style.color="red";



// for(let i = 0; i < paragraphs.length; i++)
// {
//          paragraphs[i].style.color = colorChart[i];
// }


// document.getElementsByClassName("para") => HTML Collection {}
const paragraphs = Array.from(document.getElementsByClassName("para") );


const colorChart =["red", "green", "violet", "blue"]

// paragraphs = [ p, p , p , p]
paragraphs.reverse().forEach((element,i) => {
    element.style.color = colorChart[i];
})
*/

/**
 * ! document.getElementsByTagName() = HTML Collection (length) {}
const paragraphs = Array.from(document.getElementsByTagName("p"));
console.log("paragraphs:",paragraphs);
 */

/**
 * ! document.querySelector("any css selector")
 
const p4 = document.querySelector(".parent :nth-child(2)");
console.log("p:",p4);
*/

/**
 * ! querySelectorAll() => NodeList[]


const paragraphs = document.querySelectorAll(".parent .para")
console.log("paragraphs:",paragraphs);

NodeList(length = 4) [
     0: <p class="para p1">Paragraph Tag-1</p>,
     1: <p class="para p2">Paragraph Tag-2</p>,
     2: <p class="para p3">Paragraph Tag-3</p>,
     3: <p class="para p4">Paragraph Tag-4</p>
]
 

paragraphs[0].style.color="red";
 */

/**
 * ! Difference between HtmlCollection vs NodeList
 

const paraCollection = document.getElementsByClassName("para");
const paraList = document.querySelectorAll(".parent .para");


const lastP = document.getElementById("last");
lastP.remove();


console.log("paraCollection:",paraCollection);
console.log("paraList:",paraList);
*/

/**
 * ! document.createElement()
 * ! parentElement.appendChild()
 * ! parentElement.append()


const p1 = document.createElement("p");
const p2 = document.createElement("p");


p1.textContent="Doraemon";
p2.textContent="Nobita";


// parent reference
const div = document.getElementById("root");
div.append(p1,p2, "Bla Bla Bla...");


 */

/**
 * ! insertAdjacentElement(position,element)
 * 
 * position = i) beforebegin
 *          ii) afterend
 *         iii) afterbegin
 *          iv) beforeend        


    <div id="root">
        <h1>Start</h1>
        <h1>Hello from HTML</h1>
        <h1>End</h1>
    </div>



const heading1 = document.createElement("h1");
const heading2 = document.createElement("h1");


heading1.textContent="Start";
heading2.textContent="End";

const div = document.getElementById("root");

div.insertAdjacentElement("afterbegin",heading1);
div.insertAdjacentElement("beforeend", heading2);
 */

/**
 * ! performance
 * ! fragment= document.createDocumentFragment() = <></>
 
const initial = performance.now();

    const p1 = document.createElement("p");
    const p2 = document.createElement("p");
    const p3 = document.createElement("p");
    p1.textContent = `Paragraph Tag-1`;
    p2.textContent = `Paragraph Tag-2`;
    p3.textContent = `Paragraph Tag-3`;

    const fragment = document.createDocumentFragment();
    fragment.append(p1,p2,p3)

    const div = document.getElementById("root");
    div.append(fragment);
    
const final = performance.now();
console.log("total time:", final - initial);
*/

/**
 * ! setAttribute(key,value)
 * ! getAttribute(key)
 * ! removeAttribute(key)


const h1 = document.getElementById("heading");
h1.setAttribute("class",`${h1.classList[0]} tag ${h1.classList[1]}`);
const value = h1.getAttribute("class")
 */

/**
 * ! classList = DOMTokenList[]
 

const h1 = document.getElementById("heading");

console.log(h1.classList);

// h1.classList.remove("tag");
h1.classList.add("chombi");

if(h1.classList.contains("chombi")){
    console.log("Present")
}
else{
    console.log("Not Present")
}
*/

/**
 * ! textContent
 * ! innerText
 * ! innerHTML
 * ! outerHTML


const rootDiv = document.getElementById("root");

const users = [
  {
    username: "Cheeku",
    age: 26,
    address: {
      state: "UP",
      city: "Noida",
      pin: 201301,
    },
  },
  {
    username: "Minku",
    age: 24,
    address: {
      state: "UP",
      city: "Lucknow",
      pin: 226201,
    },
  },
  {
    username: "Tinku",
    age: 28,
    address: {
      state: "Delhi",
      city: "Shahdara",
      pin: 110032,
    },
  },
];

* ! Mentos Zindagi
const x = users.map((element) => {
  const {username,age,address} = element;
  const {state,city,pin} = address;
  return `<div class="user-card" style="background-color:violet;">
                <p>Username: ${username}</p>
                <p>Age: ${age}</p>
                <p>State: ${state}</p>
                <p>City: ${city}</p>
                <p>Pincode: ${pin}</p>
            </div>`;
});

rootDiv.innerHTML = x.join(" ");
 */


/**
 * ! Aam Zindagi
rootDiv.innerHTML=  `<div class="user-card" style="background-color:violet;">
                        <p>Username: ${users[0].username}</p>
                        <p>Age: ${users[0].age}</p>
                        <p>State: ${users[0].address.state}</p>
                        <p>City: ${users[0].address.city}</p>
                        <p>Pincode: ${users[0].address.pin}</p>
                    </div>

                    <div class="user-card" style="background-color:springgreen;">
                        <p>Username: ${users[1].username}</p>
                        <p>Age: ${users[1].age}</p>
                        <p>State: ${users[1].address.state}</p>
                        <p>City: ${users[1].address.city}</p>
                        <p>Pincode: ${users[1].address.pin}</p>
                    </div>

                    <div class="user-card" style="background-color:tomato;">
                        <p>Username: ${users[2].username}</p>
                        <p>Age: ${users[2].age}</p>
                        <p>State: ${users[2].address.state}</p>
                        <p>City: ${users[2].address.city}</p>
                        <p>Pincode: ${users[2].address.pin}</p>
                    </div> `;
                    
 */

// ! remove()
const p3 = document.querySelector("#root .p3");
p3.remove()




