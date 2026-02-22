// Ejercicio de Dibujo animado más antiguo

const cartoons = [
  { name : "Bugs Bunny",                   debut : 1938 },
  { name : "SpongeBob SquarePants",        debut : 1999 },
  { name : "Tom and Jerry",                debut : 1940 },
  { name : "Mickey Mouse",                 debut : 1928 },
  { name : "Scooby-Doo",                   debut : 1969 },
  { name : "The Flintstones",              debut : 1960 },
  { name : "Batman : The Animated Series", debut : 1992 },
  { name : "The Simpsons",                 debut : 1989 },
  { name : "Pokémon",                      debut : 1997 },
  { name : "Dexter's Laboratory",          debut : 1996 },
];

let masAntiguo = cartoons [0];

for (let i = 1; i < cartoons.length; i ++ ) {
  if (cartoons [i].debut < masAntiguo.debut) {
    masAntiguo = cartoons [i];
  }
}

console.log ("El dibujo animado más antiguo es:", masAntiguo.name);