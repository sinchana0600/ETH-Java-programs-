<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Food Gallery</title>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins', sans-serif;
}

body {
  background: #0f0f0f;
  color: white;
}

header {
  text-align: center;
  padding: 20px;
  font-size: 28px;
  font-weight: bold;
}

.hero {
  height: 60vh;
  display: flex;
  align-items: center;
  justify-content: center;
}

.hero img {
  max-width: 90%;
  max-height: 90%;
  object-fit: contain;
  transition: opacity 0.8s ease-in-out;
}

.fade {
  opacity: 0;
}

.gallery {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(180px,1fr));
  gap: 20px;
  padding: 20px;
}

.card {
  background: #1c1c1c;
  border-radius: 15px;
  overflow: hidden;
  cursor: pointer;
  transition: 0.3s;
}

.card img {
  width: 100%;
  height: 150px;
  object-fit: cover;
}

.card p {
  text-align: center;
  padding: 10px;
}

.card:hover {
  transform: scale(1.05);
}
</style>
</head>

<body>

<header>🍴 Food Gallery</header>

<div class="hero">
  <img id="mainImage" src="https://images.pexels.com/photos/2619967/pexels-photo-2619967.jpeg">
</div>

<div class="gallery">

  <div class="card"><img src="https://images.pexels.com/photos/2619967/pexels-photo-2619967.jpeg"><p>Pizza</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg"><p>Burger</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/5410400/pexels-photo-5410400.jpeg"><p>Biryani</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg"><p>Pasta</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg"><p>Cake</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/70497/pexels-photo-70497.jpeg"><p>Sandwich</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg"><p>Fries</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg"><p>Ice Cream</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/3026804/pexels-photo-3026804.jpeg"><p>Donut</p></div>
  <div class="card"><img src="https://images.pexels.com/photos/302899/pexels-photo-302899.jpeg"><p>Chocolate</p></div>

</div>

<script>
const main = document.getElementById("mainImage");

/* MANY FOOD IMAGES */
const images = [
  "https://images.pexels.com/photos/2619967/pexels-photo-2619967.jpeg",
  "https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg",
  "https://images.pexels.com/photos/5410400/pexels-photo-5410400.jpeg",
  "https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg",
  "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
  "https://images.pexels.com/photos/70497/pexels-photo-70497.jpeg",
  "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
  "https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg",
  "https://images.pexels.com/photos/3026804/pexels-photo-3026804.jpeg",
  "https://images.pexels.com/photos/302899/pexels-photo-302899.jpeg"
];

let i = 0;

setInterval(() => {
  main.classList.add("fade");

  setTimeout(() => {
    main.src = images[i];
    main.classList.remove("fade");
    i = (i + 1) % images.length;
  }, 400);

}, 2000);

/* CLICK FEATURE */
document.querySelectorAll(".card img").forEach(img => {
  img.addEventListener("click", () => {
    main.src = img.src;
  });
});
</script>

</body>
</html>
