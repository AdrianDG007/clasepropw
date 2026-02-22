// Ejercicio de Encontrar la capital de un país

const capitals = { Spain : "Madrid", France : "Paris", Italy : "Rome", Germany : "Berlin", Portugal : "Lisbon", Poland : "Warsaw", Greece : "Athens", Austria : "Vienna", Hungary : "Budapest", Ireland : "Dublin"};

function getCapital (country) {
  if ( capitals [country] ) {
    return "La capital de " + country + " es " + capitals [country];
  } else {
    return "Lo siento, el país '" + country + "' no está en la lista";
  }
}

console.log (getCapital ("Spain") );
console.log (getCapital ("France") );
console.log (getCapital ("Japan") ); 