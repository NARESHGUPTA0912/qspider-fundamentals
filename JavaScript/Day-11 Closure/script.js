const parent = () => 
    {
            console.log("Parent function called..");

            const bottle = "jaypee 1-liter";
            const mobile = "Apple 17 pro";

            const child = () => {
                   console.log("Child function called..")
                   console.log(mobile);
                   console.log(bottle);
            }

            return child;
    }

const res = parent() ;
console.log("res:",res);
res();

// Drawback of closure :-
// High Memory Consumption - every time you call a function a new fresh closure is created.