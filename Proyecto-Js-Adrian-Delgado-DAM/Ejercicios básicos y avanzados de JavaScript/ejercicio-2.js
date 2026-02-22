// Ejercicio de Objetos y strings

// 1. Luke Skywalker cumple años
// Con const no podemos reasignar el objeto entero pero si podemos cambiar propiedades
const jedi = { nombre: "Luke Skywalker", edad: 19 };
jedi.edad = 25;
console.log ("Edad actualizada de Luke:", jedi.edad);

// 2. Presentación al estilo Leia Organa
let nombre   = "Leia";
let apellido = "Organa";
let edad     = 20;

// Concatenamos con el operador +
console.log("Soy " + nombre + " " + apellido + ", tengo " + edad + " años y soy una princesa de Alderaan.");

// 3. Precio total de los sables de luz
const sable1 = { nombre : "Shoto de Yoda",        precio : 1500 };
const sable2 = { nombre : "Sable de Darth Vader", precio : 2000 };

let precioTotal = sable1.precio + sable2.precio;
console.log ("Precio total de los dos sables:", precioTotal);

// 4. Actualizando el precio final de las naves
let precioBaseGlobal = 10000;
precioBaseGlobal     = 25000; // Cambiamos el precio a 25.000 créditos

const nave1 = { nombre : "Ala-X",            precioBase : 50000, precioFinal : 60000 };
const nave2 = { nombre : "Halcón Milenario", precioBase : 70000, precioFinal : 80000 };

nave1.precioFinal = nave1.precioBase + precioBaseGlobal;
nave2.precioFinal = nave2.precioBase + precioBaseGlobal;

console.log ("Precio final del " + nave1.nombre + ":", nave1.precioFinal);
console.log ("Precio final del " + nave2.nombre + ":", nave2.precioFinal);