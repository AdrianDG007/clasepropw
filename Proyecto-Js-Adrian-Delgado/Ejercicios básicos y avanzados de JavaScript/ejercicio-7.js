// EJERCICIO 7 - Función número mayor

function greaterNumber (numOne, numTwo) {
  // Comparamos los dos números
  if (numOne > numTwo) {
    console.log ("El número más alto es:", numOne);
  } else if (numTwo > numOne) {
    console.log ("El número más alto es:", numTwo);
  } else {
    // Si son iguales lo decimos también
    console.log ("Los 2 números son iguales:", numOne);
  }
}

// Probamos la función
greaterNum (10, 25);
greaterNum (100, 3);
greaterNum (7,   7);
