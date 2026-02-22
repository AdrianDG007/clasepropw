// Ejercicio de Buscador de nombres

const names = [ "Peter", "Steve", "Tony", "Natasha", "Clint", "Logan", "Xabier", "Bruce", "Peggy", "Jessica", "Marc",];

function nameFinder (nameList, valorBuscado) {
  let posicion = nameList.indexOf (valorBuscado);

  if (posicion !== - 1) {
    console.log (true, " - Posición:", posicion);
  } else {
    console.log (false);
  }
}

nameFinder (names, "Tony");      
nameFinder (names, "Logan");     
nameFinder (names, "Hulk");      
