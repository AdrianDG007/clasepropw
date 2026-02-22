// Ejercito de Listas dinámicas e imágenes

const countries   = ["Japón", "Nicaragua", "Suiza", "Australia", "Venezuela"];
const listaPaises = document.createElement ("ul");

for  (let pais of countries) {
  const item       = document.createElement ("li");
  item.textContent = pais;
  listaPaises.appendChild (item);
}
document.body.appendChild (listaPaises);

const aEliminar = document.querySelector (".fn-remove-me");
aEliminar.remove ();

const cars        = ["Mazda 6", "Ford fiesta", "Audi A4", "Toyota corola"];
const contenedor  = document.querySelector ('[data-function="printHere"]');
const listaCoches = document.createElement ("ul");

for  (let coche of cars) {
  const item       = document.createElement ("li");
  item.textContent = coche;
  listaCoches.appendChild (item);
}
contenedor.appendChild (listaCoches);

const countriesConImg = [
  { title : "Random title", imgUrl : "https://picsum.photos/300/201?random=1" },
  { title : "Random title", imgUrl : "https://picsum.photos/320/202?random=2" },
  { title : "Random title", imgUrl : "https://picsum.photos/100/201?random=3" },
  { title : "Random title", imgUrl : "https://picsum.photos/400/220?random=4" },
  { title : "Random title", imgUrl : "https://picsum.photos/500/200?random=5" },
];

const galeria = document.createElement ("div");
galeria.classList.add ("galeria");

for  (let pais of countriesConImg) {
  const tarjeta = document.createElement ("div");
  tarjeta.classList.add ("tarjeta");

  const titulo       = document.createElement ("h4");
  titulo.textContent = pais.title;

  const imagen = document.createElement ("img");
  imagen.src   = pais.imgUrl;
  imagen.alt   = pais.title;

  tarjeta.appendChild (titulo);
  tarjeta.appendChild (imagen);
  galeria.appendChild (tarjeta);
}

document.body.appendChild (galeria);

const btnEliminarUltimo       = document.createElement ("button");
btnEliminarUltimo.textContent = "Eliminar último";
btnEliminarUltimo.id          = "btn-eliminar-ultimo";

btnEliminarUltimo.addEventListener ("click", function  () {
  const ultimo = galeria.lastElementChild;
  if  (ultimo) {
    ultimo.remove ();
  }
});

document.body.insertBefore (btnEliminarUltimo, galeria);

const tarjetas = galeria.querySelectorAll (".tarjeta");

tarjetas.forEach (function  (tarjeta) {
  const btnEliminar = document.createElement ("button");
  btnEliminar.textContent = "Eliminar este";

  btnEliminar.addEventListener ("click", function  () {
    tarjeta.remove ();
  } );

  tarjeta.appendChild (btnEliminar);
} );