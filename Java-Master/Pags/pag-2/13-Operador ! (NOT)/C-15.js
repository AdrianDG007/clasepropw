// !operando

//ejemplo:
console.log(!true); // false
console.log(!false); // true

// cuando concatenamos varios operadores NOT seguidos no obtenemos ningún error,
// tenemos que leer de derecha a izquierda como van negando lo anterior,
// en este caso al ser pares será false, si fuesen impares sería true,
// esto no es tan común verlo pero es para que veáis que no hay ningún fallo como tal y
// simplemente cada ! niega lo anterior de derecha a izquierda
console.log(!!!!false); // false