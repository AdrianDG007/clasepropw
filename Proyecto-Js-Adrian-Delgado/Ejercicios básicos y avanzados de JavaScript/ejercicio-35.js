// Ejercicio de Buscar mutante por poder

const mutants = [
  { name : "Wolverine",    power : "regeneration" },
  { name : "Magneto",      power : "magnetism" },
  { name : "Professor X",  power : "telepathy" },
  { name : "Jean Grey",    power : "telekinesis" },
  { name : "Rogue",        power : "power absorption" },
  { name : "Storm",        power : "weather manipulation" },
  { name : "Mystique",     power : "shape-shifting" },
  { name : "Beast",        power : "superhuman strength" },
  { name : "Colossus",     power : "steel skin" },
  { name : "Nightcrawler", power : "teleportation" },
];

function findMutantByPower (mutants, power) {
  let encontrados = [];

  for (let i = 0; i < mutants.length; i ++ ) {
    if (mutants [i].power === power) {
      encontrados.push (mutants [i].name);
    }
  }

  if (encontrados.length > 0) {
    return "Mutante(s) con el poder '" + power + "' encontrado(s): " + encontrados.join (", ");
  } else {
    return "No se encontró ningún mutante con el poder '" + power + "'";
  }
}

console.log (findMutantByPower (mutants, "telepathy") );
console.log (findMutantByPower (mutants, "teleportation") );
console.log (findMutantByPower (mutants, "flying") ); 
