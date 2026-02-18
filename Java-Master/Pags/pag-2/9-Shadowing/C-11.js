let pokemonExt = 'Charmander';

function showPokemon() {
  let pokemonExt ="Squirtle"; // declara variable local

  console.log(pokemonExt); // Squirtle
}

// la función crea y tuiliza su propia variable local pokemonExt
showPokemon();

console.log(pokemonExt);
// Charmander -> se mantiene, la función no accedió a la variable externa porque dentro
// tiene una declaración de una variable que se llama igual y por lo tanto no afecta a la variable global
// si no a su variable local
