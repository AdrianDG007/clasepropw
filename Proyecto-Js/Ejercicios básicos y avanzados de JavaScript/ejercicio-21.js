// Ejercicio de Mayores y menores de edad

const users = [
  { name : "Tony",    years : 43 },
  { name : "Peter",   years : 18 },
  { name : "Natasha", years : 14 },
  { name : "Bruce",   years : 32 },
  { name : "Khamala", years : 16 },
];

for (let i = 0; i < users.length; i ++ ) {
  if (users [i].years < 18) {
    console.log ("Usuarios menores de edad:", users [i].name);
  } else {
    console.log ("Usuarios mayores de edad:", users [i].name);
  }
}
