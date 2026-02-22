// Ejercicio de Arrays

const aldeanos = ["Fibrilio", "Narciso", "Vacarena", "Tendo", "Nendo"];

// 4.1 Sacar "Tendo" por su posición
console.log (" 4.1 Tendo:", aldeanos [3] );

// 4.2 Añadir "Cervasio" al final
aldeanos.push ("Cervasio");
console.log   ("4.2 Con Cervasio al final:", aldeanos);

// 4.3 Cambiar el primer elemento por "Bambina"
aldeanos [0] = "Bambina";
console.log ("4.3 Primer elemento cambiado:", aldeanos);

// 4.4 Dar la vuelta al array
aldeanos.reverse ();
console.log      ("4.4 Array al revés:", aldeanos);

// 4.5 Cambiar "Narciso" por "Canela"
// Primero buscamos donde esta Narciso
let posNarciso = aldeanos.indexOf ("Narciso");
// Usamos splice para sustituirlo: (posición, cuántos borrar, qué poner)
aldeanos.splice (posNarciso, 1, "Canela");
console.log     ("4.5 Narciso cambiado por Canela:", aldeanos);

// 4.6 Imprimir el último elemento sin poner la posición directamente
// Usamos length - 1 para coger el último
console.log ( "4.6 Último elemento:", aldeanos [aldeanos.length - 1] );