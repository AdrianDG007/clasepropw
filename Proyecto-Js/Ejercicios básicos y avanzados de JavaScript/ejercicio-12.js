// Ejercicio de Eliminar duplicados

const duplicates = [ "sushi", "pizza", "burger", "potatoe", "pasta", "ice-cream", "pizza", "chicken", "onion rings", "pasta", "soda",];

function removeDuplicates (list) {
  let sinDuplicados = [];

  for (let i = 0; i < list.length; i ++ ) {
    if ( !sinDuplicados.includes ( list [i] ) ) {
      sinDuplicados.push ( list [i] );
    }
  }
  return sinDuplicados;
}

console.log ("Array sin duplicados:", removeDuplicates (duplicates) );
