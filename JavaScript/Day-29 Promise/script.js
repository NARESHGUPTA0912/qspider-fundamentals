/** callbacks use to perform async operations
 * 
 * ! Drawbacks of callback
 *    - Callback hell:- Pyramid of doom
 *    - Inversion of control:- loose your control on your own code

function getUsers(cb)
{
    setTimeout(()=>{
            const users = ["Tinku", "Cheeku", "Minku"];
          cb(users)
    },5000)
}


function getPosts(cb){
     setTimeout(()=>{
            const posts = ["post-1", "post-2"];
            cb(posts)
    },5000)
}


function getConnectionRequest(cb){
    setTimeout(()=>{
            const requests = ["Shivam", "Ajit"];
            cb(requests);
    },2000)
}


getUsers((users)=>{
        console.log("res of users:",users);

        getPosts((posts)=>{
            console.log("res of posts:",posts);

                getConnectionRequest( (requests) => {
                        console.log("res of connection requests:",requests)
                })

        })

})
 */

/**
 * ! Inversion of control
 */

import proceedToPayment from "./payment.js"

function createOrder(cb)
{
    const orderId = Math.floor(100000+ Math.random()*99999);
    cb()
    
}

createOrder(proceedToPayment)