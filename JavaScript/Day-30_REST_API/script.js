// read
async function getProducts() {
  try {
    const response = await fetch("https://dummyjson.com/products");
    const data = await response.json();

    console.log(data);

    displayProducts(data.products);
  } catch (error) {
    console.error("Error:", error);
  }
}

function displayProducts(products) {
  const container = document.getElementById("productList");
  container.innerHTML = "";

  products.forEach(product => {
    const div = document.createElement("div");
    div.innerHTML = `
      <h3>${product.title}</h3>
      <p>Price: $${product.price}</p>
      <button onclick="deleteProduct(${product.id})">Delete</button>
      <hr>
    `;
    container.appendChild(div);
  });
}

// create
async function addProduct() {
  try {
    const response = await fetch("https://dummyjson.com/products/add", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        title: "New Phone",
        price: 700
      })
    });

    const data = await response.json();
    console.log("Added:", data);
  } catch (error) {
    console.error(error);
  }
}

// update
async function updateProduct(id) {
  try {
    const response = await fetch(`https://dummyjson.com/products/${id}`, {
      method: "PUT",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        price: 999
      })
    });

    const data = await response.json();
    console.log("Updated:", data);
  } catch (error) {
    console.error(error);
  }
}

// delete
async function deleteProduct(id) {
  try {
    const response = await fetch(`https://dummyjson.com/products/${id}`, {
      method: "DELETE"
    });

    const data = await response.json();
    console.log("Deleted:", data);
  } catch (error) {
    console.error(error);
  }
}

// user login
async function loginUser() {
  try {
    const response = await fetch("https://dummyjson.com/auth/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        username: "kminchelle",
        password: "0lelplR"
      })
    });

    const data = await response.json();
    console.log("User:", data);
  } catch (error) {
    console.error(error);
  }
}