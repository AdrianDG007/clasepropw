//! Spread operator


const alumno = {
    name     : "Santi",
    aprobado : true
}

const alumno2 = {...alumno};

alumno2.name = "María";

/* console.log(alumno);
console.log(alumno2); */

const lista = ["elemento1", "elemento2", "elemento3", "elemento4"];

const lista2 = ["elemento5", "elemento6"];


const newArray = [...lista, ...lista2];

/* console.log (newArray); */

const newAlumno = {...alumno, suspenso : true}

console.log (newAlumno);