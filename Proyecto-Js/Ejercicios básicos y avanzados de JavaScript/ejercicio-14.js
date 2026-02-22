// Ejercicio de Contador de repeticiones

const words = [ "code", "repeat", "eat", "sleep", "code", "enjoy", "sleep", "code", "enjoy", "sleep", "code",];

function repeatCounter (list) {
  let conteo = {};

  for (let i = 0; i < list.length; i ++ ) {
    let palabra = list [i];

    if ( conteo [palabra] ) {
      conteo [palabra] = conteo [palabra] + 1;
    } else {
      conteo [palabra] = 1;
    }
  }
  return conteo;
}

console.log ( "Conteo de repeticiones:", repeatCounter (words) );
