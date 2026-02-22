// Ejemplo de Swap: intercambiar elementos de un array

const fantasticFour = [ "La antorcha humana", "Mr. Fantástico", "La mujer invisible", "La cosa",];

function swap (array, indice1, indice2) {
  let temporal = array [indice1];

  array [indice1] = array [indice2];

  array [indice2] = temporal;

  return array;
}

console.log ("Array original:", fantasticFour);

swap (fantasticFour, 0, 3);
console.log ("Después de swap (0, 3):", fantasticFour);

swap (fantasticFour, 1, 2);
console.log ("Después de swap (1, 2):", fantasticFour);
