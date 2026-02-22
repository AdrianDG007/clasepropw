
// Ejercicio Filter con input del usuario

const streamers = [
  { name : "Rubius",    age : 32, gameMorePlayed : "Minecraft" },
  { name : "Ibai",      age : 25, gameMorePlayed : "League of Legends" },
  { name : "Reven",     age : 43, gameMorePlayed : "League of Legends" },
  { name : "AuronPlay", age : 33, gameMorePlayed : "Among Us" },
];

const input = document.querySelector ('[data-function="toFilterStreamers"]');

// Cada vez que el usuario escribe algo, filtramos los streamers
input.addEventListener ( "input", function (evento) {
  const textoBuscado = evento.target.value;

  // filter + includes : nos quedamos solo con los que incluyan el texto del input
  // toLowerCase () para que no importe si escribes en mayúsculas o minúsculas
  const streamersFiltrados = streamers.filter ( function  (streamer) {
    return streamer.name.toLowerCase ().includes ( textoBuscado.toLowerCase () );
  } );

  console.log ("Streamers encontrados para '" + textoBuscado + "' :", streamersFiltrados);
} );
