const coche = {
    puertas : 5,
    color   : "rojo",
    itv     : true
}

const { marca : marcaDestructuring = "Peugeot", color, puertas, itv = fasle} =coche;

console.log (color);
console.log (marcaDestructurin);
console.log (itv);

//! array
const lista = ["💛","❤️","💚"];

const [primerCorazon, , tercerCorazon] = lista;

console.log (primerCorazon);
console.log (tercerCorazon);