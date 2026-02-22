// EJERCICIO 25 - Películas antes y después del año 2000

const movies = [
  { title : "The Matrix",                          releaseYear : 1999 },
  { title : "Star Wars : Episode IV - A New Hope", releaseYear : 1977 },
  { title : "Inception",                           releaseYear : 2010 },
  { title : "Jurassic Park",                       releaseYear : 1993 },
  { title : "The Shawshank Redemption",            releaseYear : 1994 },
  { title : "Pulp Fiction",                        releaseYear : 1994 },
  { title : "Avatar",                              releaseYear : 2009 },
  { title : "The Dark Knight",                     releaseYear : 2008 },
  { title : "Fight Club",                          releaseYear : 1999 },
  { title : "Forrest Gump",                        releaseYear : 1994 },
];

let antes2000   = 0;
let despues2000 = 0;

for (let i = 0; i < movies.length; i ++ ) {
  if (movies [i].releaseYear < 2000) {
    antes2000 ++ ;
  } else {
    despues2000 ++ ;
  }
}

console.log ("Películas antes del año 2000:",       antes2000);
console.log ("Películas del año 2000 en adelante:", despues2000);
