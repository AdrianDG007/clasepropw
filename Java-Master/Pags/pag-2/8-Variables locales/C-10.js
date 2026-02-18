  function showPokemon() {
    let pokemon = "Pikachu"; // variable local
    console.log(pokemon);
}

showPokemon(); // Pikachu

console.log(pokemon); // <-- Erro! La variable es local para esta función
