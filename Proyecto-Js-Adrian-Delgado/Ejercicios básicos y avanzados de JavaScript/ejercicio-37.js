// Ejercicio de Sacar categorías únicas de películas

const movies = [
  {
    title      : "Bracula: Condemor II",
    duration   : 192,
    categories : ["comedia", "aventura"],
  },
  {
    title      : "Spider-Man: No Way Home",
    duration   : 122,
    categories : ["aventura", "acción"],
  },
  {
    title      : "The Voices",
    duration   : 223,
    categories : ["comedia", "thriller"],
  },
  {
    title      : "Shrek",
    duration   : 111,
    categories : ["comedia", "aventura", "animación"],
  },
];

let categorias = [];

for (let pelicula of movies) {
  for (let categoria of pelicula.categories) {
    if ( !categorias.includes (categoria) ) {
      categorias.push (categoria);
    }
  }
}

console.log ("Categorías únicas:", categorias);
