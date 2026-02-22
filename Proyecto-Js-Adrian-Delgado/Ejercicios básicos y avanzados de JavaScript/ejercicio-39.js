// Ejercicio de Cuántas veces aparece cada sonido como favorito

const users = [
  {
    name : "Alberto",
    favoritesSounds : {
      waves    : { format : "mp3", volume : 50 },
      rain     : { format : "ogg", volume : 60 },
      firecamp : { format : "mp3", volume : 80 },
    },
  },
  {
    name : "Antonio",
    favoritesSounds : {
      waves  : { format : "mp3", volume : 30 },
      shower : { format : "ogg", volume : 55 },
      train  : { format : "mp3", volume : 60 },
    },
  },
  {
    name : "Santiago",
    favoritesSounds : {
      shower   : { format : "mp3", volume : 50 },
      train    : { format : "ogg", volume : 60 },
      firecamp : { format : "mp3", volume : 80 },
    },
  },
  {
    name : "Laura",
    favoritesSounds : {
      waves    : { format : "mp3", volume : 67 },
      wind     : { format : "ogg", volume : 35 },
      firecamp : { format : "mp3", volume : 60 },
    },
  },
];

let conteoSonidos = {};

for (let usuario of users) {
  for (let nombreSonido in usuario.favoritesSounds) {
    if ( conteoSonidos [nombreSonido] ) {
      conteoSonidos [nombreSonido] ++ ;
    } else {
      conteoSonidos [nombreSonido] = 1;
    }
  }
}

console.log ("Veces que aparece cada sonido como favorito :", conteoSonidos);
