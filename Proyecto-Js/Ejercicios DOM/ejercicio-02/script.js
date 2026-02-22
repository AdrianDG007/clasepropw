// Ejercicio deInsertar y eliminar elementos

const div1 = document.createElement ("div");
document.body.appendChild (div1);
console.log ("2.1 Div vacío añadido");

const div2     = document.createElement ("div");
const p2       = document.createElement ("p");
p2.textContent = "Soy un párrafo dentro de un div";
div2.appendChild (p2);
document.body.appendChild (div2);
console.log ("2.2 Div con p añadido");

const div3 = document.createElement ("div");
for  (let i = 1; i <= 6; i ++) {
  const parrafo       = document.createElement ("p");
  parrafo.textContent = "Párrafo número " + i;
  div3.appendChild (parrafo);
}
document.body.appendChild (div3);
console.log ("2.3 Div con 6 párrafos añadido");

const p4       = document.createElement ("p");
p4.textContent = "Soy dinámico!";
document.body.appendChild (p4);
console.log ("2.4 P dinámica añadida");

const h2       = document.querySelector ("h2.fn-insert-here");
h2.textContent = "Wubba Lubba dub dub";
console.log ("2.5 Texto insertado en el h2");

const apps  = ["Facebook", "Netflix", "Instagram", "Snapchat", "Twitter"];
const lista = document.createElement ("ul");
for  (let app of apps) {
  const item       = document.createElement ("li");
  item.textContent = app;
  lista.appendChild (item);
}
document.body.appendChild (lista);
console.log ("2.6 Lista de apps creada");

const aEliminar = document.querySelectorAll (".fn-remove-me");
aEliminar.forEach (function (elemento) {
  elemento.remove ();
} );
console.log ("2.7 Elementos .fn-remove-me eliminados");

const todosLosDivs   = document.querySelectorAll ("div");
const primerDiv      = todosLosDivs[0];
const pEnMedio       = document.createElement ("p");
pEnMedio.textContent = "Voy en medio!";
primerDiv.insertAdjacentElement ("afterend", pEnMedio);
console.log ("2.8 P insertada en medio");

const divsConClase = document.querySelectorAll ("div.fn-insert-here");
divsConClase.forEach (function  (div) {
  const pDentro       = document.createElement ("p");
  pDentro.textContent = "Voy dentro!";
  div.appendChild (pDentro);
} );
console.log ("2.9 P insertada dentro de cada .fn-insert-here");
