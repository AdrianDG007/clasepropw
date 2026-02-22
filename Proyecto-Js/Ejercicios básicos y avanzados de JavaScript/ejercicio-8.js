// EJERCICIO 8 - Buscar la palabra más larga

const avengers = [
  "Hulk",
  "Thor",
  "Iron Man",
  "Captain A.",
  "Spiderman",
  "Captain M.",
];

function findLongestWord (stringList) {
  // Empezamos guardando el primer elemento como el más largo
  let masLargo = stringList [0];

  // Recorremos el resto del array
  for (let i = 1; i < stringList.length; i ++ ) {
    // Si el siguiente es más largo, lo guardamos
    if (stringList [i].length > masLargo.length) {
      masLargo = stringList [i];
    }
    // Si son iguales se queda el primero
  }
  return masLargo;
}

console.log ( "La palabra más larga es:", findLongestWord (avengers) );
