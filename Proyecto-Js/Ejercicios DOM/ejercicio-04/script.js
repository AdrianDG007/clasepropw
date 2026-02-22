// Ejercicio de Eventos

const boton = document.getElementById ("btnToClick");

boton.addEventListener ( "click", function (evento) {
  console.log ("1.1 Info del evento click:", evento);
} );

const inputFocus = document.querySelector (".focus");

inputFocus.addEventListener ( "focus", function (evento) {
  console.log ("1.2 Valor del input al hacer focus:", evento.target.value);
} );

const inputValor = document.querySelector (".value");

inputValor.addEventListener ( "input", function (evento) {
  console.log ("1.3 Valor actual mientras escribes:", evento.target.value);
} );
