// Ejercicio de Lista de álbumes de metal

const albums = [ "De Mysteriis Dom Sathanas", "Reign of Blood", "Ride the Lightning", "Painkiller", "Iron Fist",];

const main = document.querySelector("main");

const listaAlbums = document.createElement("ul");
listaAlbums.id    = "lista-albums";

for (let i = 0; i < albums.length; i ++ ) {
  const item = document.createElement ("li");

  const numero = document.createElement ("span");
  numero.classList.add ("numero");
  numero.textContent = "#" + (i + 1);

  item.appendChild (numero);
  item.appendChild ( document.createTextNode (albums [i] ) );

  listaAlbums.appendChild (item);
}

main.appendChild (listaAlbums);
