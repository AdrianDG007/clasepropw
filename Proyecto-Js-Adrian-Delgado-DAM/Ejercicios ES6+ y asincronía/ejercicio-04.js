// ejercicio de .filter ()

const ages = [22, 14, 24, 55, 65, 21, 12, 13, 90];

const mayoresDeEdad = ages.filter ( function  (edad) {
  return edad > 18;
} );
console.log ("4.1 Mayores de 18 :", mayoresDeEdad);

const soloParess = ages.filter ( function  (edad) {
  return edad % 2 === 0;
} );
console.log ("4.2 Números pares :", soloParess);

const streamers = [
  { name : "Rubius",    age : 32, gameMorePlayed : "Minecraft" },
  { name : "Ibai",      age : 25, gameMorePlayed : "League of Legends" },
  { name : "Reven",     age : 43, gameMorePlayed : "League of Legends" },
  { name : "AuronPlay", age : 33, gameMorePlayed : "Among Us" },
];

const leagueStreamers = streamers.filter ( function  (streamer) {
  return streamer.gameMorePlayed === "League of Legends";
} );
console.log ("4.3 Streamers de LoL :", leagueStreamers);

const conLetraU = streamers.filter ( function  (streamer) {
  return streamer.name.includes ("u");
} );
console.log ("4.4 Streamers con 'u' en el nombre :", conLetraU);

const legends = streamers.filter ( function  (streamer) {
  return streamer.gameMorePlayed.includes ("Legends");
} );

const legendsConMayusculas = legends.map ( function  (streamer) {
  if  (streamer.age > 35) {
    return { ...streamer, gameMorePlayed : streamer.gameMorePlayed.toUpperCase () };
  }
  return streamer;
} );
console.log ("4.5 Streamers de Legends  (mayúsculas si > 35 años) :", legendsConMayusculas);
