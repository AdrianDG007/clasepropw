// Ejercicio Spread operator  (...)

const pointsList = [32, 54, 21, 64, 75, 43];

const copiaPointsList = [...pointsList];
console.log ("2.1 Copia del array :",     copiaPointsList);
console.log ("2.1 ¿Son el mismo array?", pointsList === copiaPointsList);

const toy = { name : "Bus laiyiar", date : "20-30-1995", color : "multicolor" };

const copiaToy = { ...toy };
console.log ("2.2 Copia del objeto :", copiaToy);

const pointsLis2 = [54, 87, 99, 65, 32];

const arrayUnido = [...pointsList, ...pointsLis2];
console.log ("2.3 Arrays unidos :", arrayUnido);

const toyUpdate = { lights : "rgb", power : ["Volar like a dragon", "MoonWalk"] };

const toyFusionado = { ...toy, ...toyUpdate };
console.log ("2.4 Objeto fusionado :", toyFusionado);

const colors = ["rojo", "azul", "amarillo", "verde", "naranja"];

const colorsSinAmarillo = [...colors.slice (0, 2), ...colors.slice (3)];

console.log ("2.5 Array original  (sin tocar) :", colors);
console.log ("2.5 Copia sin posición 2 :",        colorsSinAmarillo);
