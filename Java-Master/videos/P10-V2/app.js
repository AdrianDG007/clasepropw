const title = document.createElement ("h1");
title.innerText = "Title";
console.log (title);

document.body.appendChild (tilte);

const image = document.createElement ("img");
image.src = "data:image/png;base64,iVBORwOKgoAAAANSUhEUgAAJsAAcb"
image.alt =  "JavaScript logo";
document.body.appendChild (image);

const div = document.createElement ("div");
const content = "Este es el contenido"
div.innerHTML = `<p>${content}</p>`;
document.body.appendChild (div);

image.classList.add ("byw");
image.classList.remove ("byw");
image.classList.toggle ("byw");
image.classList.toggle ("byw");
console.log (image.classList.contains ("byw"))