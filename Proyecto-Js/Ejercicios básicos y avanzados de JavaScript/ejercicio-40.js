// Ejercicio de findArrayIndex y removeItem

const mainCharacters = [ "Luke", "Leia", "Han Solo", "Chewbacca", "Rey", "Anakin", "Obi-Wan",];

function findArrayIndex (array, text) {
  for (let i = 0; i < array.length; i ++) {
    if  (array [i] === text) {
      return i;
    }
  }
  return - 1;
}

console.log ( "Posición de 'Rey':", findArrayIndex (mainCharacters, "Rey") ); 
console.log ( "Posición de 'Luke':", findArrayIndex (mainCharacters, "Luke") ); 
console.log ( "Posición de 'Yoda':", findArrayIndex (mainCharacters, "Yoda") ); 

function removeItem (array, text) {
  let indice = findArrayIndex (array, text);

  if  (indice !== -1) {
    array.splice (indice, 1);
  }
  return array;
}

console.log ("Array original:", mainCharacters);
removeItem  (mainCharacters, "Chewbacca");
console.log ("Sin Chewbacca:", mainCharacters);
removeItem  (mainCharacters, "Anakin");
console.log ("Sin Anakin:", mainCharacters);
