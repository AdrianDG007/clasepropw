// Ejercicio de Destructuring

const game = { title : "The Last of Us 2", gender : ["action", "zombie", "survival"], year : 2020 };

const       { title, gender, year } = game;
console.log ("1.1 Título :", title);
console.log ("1.1 Género :", gender);
console.log ("1.1 Año :", year);

const fruits = ["Banana", "Strawberry", "Orange"];

const [fruit1, fruit2, fruit3] = fruits;
console.log ("1.2 Fruta 1 :", fruit1);
console.log ("1.2 Fruta 2 :", fruit2);
console.log ("1.2 Fruta 3 :", fruit3);

const animalFunction = () => {
  return { name : "Bengal Tiger", race : "Tiger" };
};

const { name, race } = animalFunction();
console.log ("1.3 Nombre :", name);
console.log ("1.3 Raza :", race);

const car = { name : "Mazda 6", itv : [2015, 2011, 2020] };

const { name : nombreCoche, itv } = car;

const [año1, año2, año3] = itv;

console.log ("1.4 Nombre del coche :", nombreCoche);
console.log ("1.4 ITV completo :",     itv);
console.log ("1.4 Año 1 :",            año1);
console.log ("1.4 Año 2 :",            año2);
console.log ("1.4 Año 3 :",            año3);
