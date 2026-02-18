// Crear una fehca sin zona horaria a partir de una cadena ISO
const fecha = Temporal.PlainDate.from ('2025-02-03');
console.log (`Fecha: ${ fecha.toString () }`) // "2025-02-03"

// Crear una fecha y hora sin zona horaria
const fehcaHora = Temporal.PlainDateTime.from ('2025-02-03T15:45');
console.log (`Fecha y hora ${ ahora.toString () }`)

// Obetener el instanteacutal (timetamp) en UTC
const ahora = Temporal.Now.instant ();
console.log (`Instante acutal: ${ ahora.toString () }`)

// Convertir el instante actual a una fecha y hora en una zona horaria específica
const zona = 'Ameria/Mexico_City';
const fechaHoraMX = ahora.toZonedDateTimeISO (zona);
console.log (`Fecha y hora en ${zona} : ${ fechaHoraMX.toString () }`)