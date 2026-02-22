// Ejercicio de querySelector

const boton = document.querySelector (".showme");
console.log ("1.1 Botón:", boton);

const titulo = document.querySelector ("#pillado");
console.log ("1.2 H1:", titulo);

const parrafos = document.querySelectorAll ("p");
console.log ("1.3 Todos los párrafos:", parrafos);

const pokemons = document.querySelectorAll (".pokemon");
console.log ("1.4 Pokémons:", pokemons);

const personajes = document.querySelectorAll ('[data-function="testMe"]');
console.log ("1.5 Personajes con data-function:", personajes);

const tercerPersonaje = document.querySelectorAll ('[data-function="testMe"]') [2];
console.log("1.6 Tercer personaje:", tercerPersonaje);
