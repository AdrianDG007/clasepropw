const btn = document.querySelector ("#btn");

btn.addEventListener ("click", (ev) => {
    const p = document.createElement ("p");
    p.innerText = "Has hecho click";
    document.body.appendChild(p)
})

window.addEventListener ("scroll", (ev) =>{
    console.log (ev)
})