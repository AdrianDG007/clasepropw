// Ejercicio de Promedio mezclado (números y strings)

const mixedElements = [ 6, 1, "Marvel", 1, "hamburguesa", "10", "Prometeo", 8, "Hola mundo",];

function averageWord (list) {
  let total    = 0;
  let cantidad = 0;

  for (let i = 0; i < list.length; i ++ ) {
    if (typeof list [i] === "number") {
      total = total + list [i];
    } else {
      total = total + list [i].length;
    }
    cantidad ++ ;
  }

  let promedio = total / cantidad;
  return promedio;
}

console.log ( "El promedio mezclado es:", averageWord (mixedElements) );
