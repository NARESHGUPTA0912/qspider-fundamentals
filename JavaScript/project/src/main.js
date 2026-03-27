const loader = document.getElementById("loader");
const login = document.getElementById("login");

// Show loader first
setTimeout(() => {
    loader.classList.add("hidden");
    login.classList.remove("hidden");
}, 3000); // 3 seconds
