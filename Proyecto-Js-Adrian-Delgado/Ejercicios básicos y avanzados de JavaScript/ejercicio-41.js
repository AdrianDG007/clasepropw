// Ejercicio de Simular una tirada de dado

function rollDice (caras) {

  let resultado = Math.floor (Math.random () * caras) + 1;
  return resultado;
}

console.log ( "Dado de 6 caras:", rollDice (6) );

console.log ( "Dado de 20 caras:", rollDice (20) );

console.log ( "Dado de 4 caras:", rollDice (4) );
