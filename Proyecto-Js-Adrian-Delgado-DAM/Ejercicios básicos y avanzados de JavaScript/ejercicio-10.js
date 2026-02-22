// Ejercicio de Calcular el promedio

const numbers = [12, 21, 38, 5, 45, 37, 6];

function average (numberList) {
  let total = 0;

  // Sumamos todos los números
  for (let i = 0; i < numberList.length; i ++ ) {
    total = total + numberList [i];
  }

  // El promedio es la suma dividida entre la cantidad de elementos
  let promedio = total / numberList.length;
  return promedio;
}

console.log ( "El promedio es:", average (numbers) );
