const p1 = document.createElement("p");
const p2 = document.createElement("p");
const p3 = document.createElement("p");

p1.textContent = "Paragraph Tag-1";
p2.textContent = "Paragraph Tag-2";
p3.textContent = "Paragraph Tag-3";

const div = document.getElementById("root");
div.append(p1,p2,p3);