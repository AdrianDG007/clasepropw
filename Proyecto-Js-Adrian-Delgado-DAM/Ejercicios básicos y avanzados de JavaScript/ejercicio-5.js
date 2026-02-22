// Ejercico de Condicionales (if)

const num1 = 10;
const num2 = 20;
const num3 = 2;

// Ejemplo dado
if (num1 === 10) {
  console.log ("num1 es estrictamente igual a 10");
}

// num2 / num1 = 20 / 10 = 2
if (num2 / num1 === 2) {
  console.log ("num2 dividido entre num1 es igual a 2");
}

// !== comprueba que son distintos
if (num1 !== num2) {
  console.log ("num1 es estrictamente distinto a num2");
}

// != comprueba que son distintossin importar el tipo
if (num3 != num1) {
  console.log ("num3 es distinto num1");
}

// num3 * 5 = 2 * 5 = 10 = num1
if (num3 * 5 === num1) {
  console.log ("num3 por 5 es igual a num1");
}

// Las dos condiciones deben cumplirse (&&)
if (num3 * 5 === num1 && num1 * 2 === num2) {
  console.log ("num3 por 5 es igual a num1 Y num1 por 2 es igual a num2");
}

// Al menos una condición debe cumplirse (||)
if (num2 / 2 === num1 || num1 / 5 === num3) {
  console.log ("num2 entre 2 es igual a num1 O num1 entre 5 es igual a num3");
}