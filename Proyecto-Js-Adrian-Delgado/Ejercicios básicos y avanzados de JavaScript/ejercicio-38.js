// Ejercicio de Media de volumen de sonidos favoritos

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
    name: "Antonio",
    favoritesSounds : {
      waves  : { format : "mp3", volume : 30 },
      shower : { format : "ogg", volume : 55 },
      train  : { format : "mp3", volume : 60 },
    },
  },
  {
    name: "Santiago",
    favoritesSounds : {
      shower   : { format : "mp3", volume : 50 },
      train    : { format : "ogg", volume : 60 },
      firecamp : { format : "mp3", volume : 80 },
    },
  },
  {
    name: "Laura",
    favoritesSounds : {
      waves    : { format : "mp3", volume : 67 },
      wind     : { format : "ogg", volume : 35 },
      firecamp : { format : "mp3", volume : 60 },
    },
  },
];

let sumaVolumenes   = 0;
let cantidadSonidos = 0;

for (let usuario of users) {
  for (let sonido in usuario.favoritesSounds) {
    sumaVolumenes = sumaVolumenes + usuario.favoritesSounds [sonido].volume;
    cantidadSonidos ++ ;
  }
}

let mediaVolumen = sumaVolumenes / cantidadSonidos;
console.log ("Media de volumen de todos los sonidos:", mediaVolumen);
