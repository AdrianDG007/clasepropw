// Ejercicio de .map()

const users = [
  { id : 1, name : "Abel" },
  { id : 2, name : "Julia" },
  { id : 3, name : "Pedro" },
  { id : 4, name : "Amanda" },
];

const soloNombres = users.map ( function (usuario) {
  return usuario.name;
} );
console.log ("3.1 Solo nombres :", soloNombres);

const nombresModificados = users.map ( function (usuario) {
  if ( usuario.name.startsWith ("A") ) {
    return "Anacleto";
  } else {
    return usuario.name;
  }
} );
console.log ("3.2 Nombres con 'A' cambiados :", nombresModificados);

const cities = [
  { isVisited : true,  name : "Tokyo" },
  { isVisited : false, name : "Madagascar" },
  { isVisited : true,  name : "Amsterdam" },
  { isVisited : false, name : "Seul" },
];

const ciudadesVisitadas = cities.map ( function (ciudad) {
  if (ciudad.isVisited) {
    return ciudad.name + " (Visitado)";
  } else {
    return ciudad.name;
  }
} );
console.log ("3.3 Ciudades con estado visitado :", ciudadesVisitadas);