// Ejercicio de Sumar todos los números de un array

const numbers = [1, 2, 3, 5, 45, 37, 58];

function sumNumbers (numberList) {
  let total = 0;

  // Vamos sumando cada número al total
  for (let i = 0; i < numberList.length; i ++ ) {
    total = total + numberList [i];
  }

  return total;
}

console.log("La suma total es:", sumNumbers(numbers));