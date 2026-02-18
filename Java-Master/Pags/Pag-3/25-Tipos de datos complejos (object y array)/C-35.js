let variable1 = [1,2];

let variable2 = variable1; // adquiere la REFERENCIA de variable1

variable2.pop(); // elimina el último elemento de un array

console.log(variable1); // [1]
console.log(variable2); // [1]