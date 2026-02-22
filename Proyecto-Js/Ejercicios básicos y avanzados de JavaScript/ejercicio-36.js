// Ejercicio de Calcular edades actuales de actores

const actors = [
  { name : "Leonardo DiCaprio",  born : 1974 },
  { name : "Tom Hanks",          born : 1956 },
  { name : "Meryl Streep",       born : 1949 },
  { name : "Brad Pitt",          born : 1963 },
  { name : "Johnny Depp",        born : 1963 },
  { name : "Scarlett Johansson", born : 1984 },
  { name : "Jennifer Lawrence",  born : 1990 },
  { name : "Denzel Washington",  born : 1954 },
  { name : "Morgan Freeman",     born : 1937 },
  { name : "Cate Blanchett",     born : 1969 },
];

function calculateActorsAges (actors) {
  let añoActual = new Date ().getFullYear ();

  let actoresConEdad = [];

  for (let i = 0; i < actors.length; i ++ ) {
    let edad = añoActual - actors [i].born;
    actoresConEdad.push ( { name : actors [i].name, age : edad } ); 
  }

  return actoresConEdad;
}

console.log ( "Actores con su edad actual:", calculateActorsAges (actors) );
