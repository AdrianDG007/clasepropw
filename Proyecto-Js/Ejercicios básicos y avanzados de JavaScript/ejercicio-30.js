// Ejercicio de Clasificar canciones por género

const tracks = [
  { title : "Enter Sandman",           genre : "Metal" },
  { title : "Back in Black",           genre : "Rock" },
  { title : "Bohemian Rhapsody",       genre : "Rock" },
  { title : "Blinding Lights",         genre : "Pop" },
  { title : "Old Town Road",           genre : "Country" },
  { title : "Smells Like Teen Spirit", genre : "Grunge" },
  { title : "Bad Guy",                 genre : "Pop" },
  { title : "Thunderstruck",           genre : "Rock" },
  { title : "Hotel California",        genre : "Rock" },
  { title : "Stairway to Heaven",      genre : "Rock" },
];

let porGenero = {};

for (let i = 0; i < tracks.length; i ++ ) {
  let cancion = tracks [i];
  let genero = cancion.genre;

  if ( !porGenero [genero] ) {
    porGenero [genero] = [];
  }

  porGenero [genero].push (cancion.title);
}

console.log ("Canciones por género:", porGenero);
