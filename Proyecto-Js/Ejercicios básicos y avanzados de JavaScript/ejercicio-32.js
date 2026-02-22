// Ejercicio de Encontrar el X-Men más antiguo

const xMen = [
  { name : "Wolverine",    year : 1974 },
  { name : "Cyclops",      year : 1963 },
  { name : "Storm",        year : 1975 },
  { name : "Phoenix",      year : 1961 },
  { name : "Beast",        year : 1963 },
  { name : "Gambit",       year : 1990 },
  { name : "Nightcrawler", year : 1975 },
  { name : "Magneto",      year : 1963 },
  { name : "Professor X",  year : 1963 },
  { name : "Mystique",     year : 1978 },
];

function findOldestXMen (xMen) {
  let masAntiguo = xMen [0];

  for (let i = 1; i < xMen.length; i ++ ) {
    if (xMen [i].year < masAntiguo.year) {
      masAntiguo = xMen [i];
    }
  }
  return masAntiguo;
}

console.log ( "El X-Men más antiguo es:", findOldestXMen (xMen) );