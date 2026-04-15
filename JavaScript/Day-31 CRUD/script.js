const API = "http://localhost:3000/products";

window.onload = getProducts;

// READ
async function getProducts() {
  const res = await fetch(API);
  const data = await res.json();
  displayProducts(data);
}

// DISPLAY
function displayProducts(products) {
  const container = document.getElementById("productList");
  container.innerHTML = "";

  products.forEach(product => {
    const div = document.createElement("div");

    div.innerHTML = `
      <h3>${product.title}</h3>
      <p>Price: $${product.price}</p>
      <button onclick='editProduct("${product.id}", "${product.title}", ${product.price})'>Edit</button>
      <button onclick='deleteProduct("${product.id}")'>Delete</button>
      <hr>
    `;

    container.appendChild(div);
  });
}

// CREATE + UPDATE
document.getElementById("productForm").addEventListener("submit", async function(e) {
  e.preventDefault();

  const id = document.getElementById("id").value;
  const title = document.getElementById("title").value;
  const price = Number(document.getElementById("price").value);

  if (id) {
    // UPDATE
    await fetch(`${API}/${id}`, {
      method: "PUT",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({ id, title, price })
    });
  } else {
    // CREATE
    await fetch(API, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({ title, price })
    });
  }

  document.getElementById("productForm").reset();
  document.getElementById("id").value = "";

  getProducts();
});

// EDIT
function editProduct(id, title, price) {
  document.getElementById("id").value = id;
  document.getElementById("title").value = title;
  document.getElementById("price").value = price;
}

// DELETE
async function deleteProduct(id) {
  console.log("Deleting:", id); // debug

  await fetch(`${API}/${id}`, {
    method: "DELETE"
  });

  getProducts();
}