const button = document.querySelector("button");

button.addEventListener(
  "click",
  () => {
    e.preventDefault();
    console.log("clicked");
    const h1 = document.querySelector("h1");
    h1.textContent = "Hey Developers..!";
  },
  {
    capture: false,
    once: true,
    signal: controller.signal,
    passive: false,
  }
);

// dispatchEvent, customEvent
