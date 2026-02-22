// Ejercicio de Pokémon aleatorio con PokeAPI

const imagen         = document.querySelector  (".random-image");
const nombreElemento = document.getElementById ("pokemon-nombre");
const numeroElemento = document.getElementById ("pokemon-numero");

async function cargarPokemonAleatorio () {
  try {
    const numeroAleatorio = Math.floor (Math.random () * 151) + 1;

    const respuesta = await fetch ("https://pokeapi.co/api/v2/pokemon/" + numeroAleatorio);
    const pokemon = await respuesta.json ();

    const urlImagen = pokemon.sprites.other ["official-artwork"].front_default;

    const imagenFinal = urlImagen || pokemon.sprites.front_default;

    imagen.src = imagenFinal;
    imagen.alt = pokemon.name;

    nombreElemento.textContent = pokemon.name;
    numeroElemento.textContent = "#" + String (pokemon.id).padStart (3, "0");

  } catch  (error) {
    console.error ("Error al cargar el Pokémon:", error);
    nombreElemento.textContent = "Error al cargar";
  }
}

cargarPokemonAleatorio ();