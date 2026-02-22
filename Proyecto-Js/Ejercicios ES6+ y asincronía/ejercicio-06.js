// Ejercicio .reduce()

const exams = [
  { name : "Yuyu Cabeza Crack",          score : 5 },
  { name : "Maria Aranda Jimenez",       score : 1 },
  { name : "Cristóbal Martínez Lorenzo", score : 6 },
  { name : "Mercedez Regrera Brito",     score : 7 },
  { name : "Pamela Anderson",            score : 3 },
  { name : "Enrique Perez Lijó",         score : 6 },
  { name : "Pedro Benitez Pacheco",      score : 8 },
  { name : "Ayumi Hamasaki",             score : 4 },
  { name : "Robert Kiyosaki",            score : 2 },
  { name : "Keanu Reeves",               score : 10 },
];

const sumaTotal = exams.reduce ( function (acumulador, alumno) {
  return acumulador + alumno.score;
}, 0);
console.log ("6.1 Suma total de notas :", sumaTotal);

const sumaAprobados = exams
  .filter ( function (alumno) {
    return alumno.score >= 5;
  } )
  .reduce(function (acumulador, alumno) {
    return acumulador + alumno.score;
  }, 0);
console.log ("6.2 Suma de notas de aprobados :", sumaAprobados);

const media = exams.reduce (function (acumulador, alumno) {
  return acumulador + alumno.score;
}, 0) / exams.length;

console.log ("6.3 Media de todas las notas :", media);