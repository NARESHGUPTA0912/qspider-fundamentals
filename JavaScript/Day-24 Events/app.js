const button = document.querySelector(".btn");

button.addEventListener("click",()=>{
    const header = document.querySelector("#header");
    const hero = document.querySelector("#hero")

    if(header.classList.contains("light") && hero.classList.contains("light"))
    {
        header.classList.add("dark");
        hero.classList.add("dark");
        header.classList.remove("light");
        hero.classList.remove("light");
    }
    else{
        header.classList.add("light");
        hero.classList.add("light");
        header.classList.remove("dark");
        hero.classList.remove("dark");
    }
})