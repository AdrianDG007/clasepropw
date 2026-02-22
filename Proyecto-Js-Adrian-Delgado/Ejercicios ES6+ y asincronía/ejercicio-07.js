// Ejercicio de .filter () + .reduce () combinados

const videogames = [
  { name : "Final Fantasy VII",                    genders : ["RPG"],                score : 9.5 },
  { name : "Assasins Creed Valhalla",              genders : ["Aventura", "RPG"],    score : 4.5 },
  { name : "The Last of Us 2",                     genders : ["Acción", "Aventura"], score : 9.8 },
  { name : "Super Mario Bros",                     genders : ["Plataforma"],         score : 8.5 },
  { name : "Genshin Impact",                       genders : ["RPG", "Aventura"],    score : 7.5 },
  { name : "Legend of Zelda : Breath of the wild", genders : ["RPG"],                score :  10 },
];

const soloRPG = videogames.filter ( function  (juego) {
  return juego.genders.find ( function  (genero) {
    return genero === "RPG";
  } );
} );

console.log ("Juegos RPG encontrados :", soloRPG);

const mediaRPG = soloRPG.reduce (function  (acumulador, juego) {
  return acumulador + juego.score;
}, 0) / soloRPG.length;

console.log ( "Media de puntuación de los juegos RPG :", mediaRPG.toFixed (2) );
