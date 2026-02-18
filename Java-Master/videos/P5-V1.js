//! métodos más importantes
// pop, push, shift, unshift, splice, slice, indexOf, includes, reserves

const array = [10,20,30,40,50,60,70,80]; //8
// posiciones = 0  1  2  3  4  5  6  7

//! métodos que modifican la matriz o el array
/* console.log ("antes del método pop:", array);

array.pop(); 

console.log("después del metodo pop:", array);*/

//? pop () -> elimina el último elemento de un array, no necesita parámetros
array.pop ();
array.pop ();

/*console.log (array);*/

//? push (elemento/s que quiera introducir) -> inserta un nuevo elemento al final array
array.push (90);

/*console.log (array);*/

//?reverse() -> dar ña vuelta al array
array.reverse ();

console.reserve ();

//? shift () -> elimina el PRIMER elemento del array, no necesita parámetros
array.shift ();
array.shift ();

/*console.long (array);*/

//? unshift (elemento/s que quiera introducir) -> inserta un nuevo elemento
array.unshift (9);

/*console.log (array);*/

//? sort() -> ordena elementos en nuestro array
const palabras = ["hola", "que", "tal", "estas"]

palabras.sort ();

/*console.log(array);*/

//? splice () -> elminiar, sustituir o añadir elementos a un array donde yo quiera
//* array = [ 9, 50, 40, 30, 20, 10]
//posicones   0  1   2   3   4   5
//                  x---------/

array.splice (2, 3, "eliminados")

console (array);
//! métodos que NO modifica la matriz o el array
/*console.log ("antes del método indexOf:", array);

console.log ( array.indexOf (50) );

console.log ("después del método indexOf:", array);*/

//? concat -> concatena (fusiona) 2 arrays
//console.log ( array.concat (palabras) );

//? toString -> convertira al array en un string
// console.log ( array.toString () );

//?indexOf -> devuelve la PRIMERA posición del elemento encontrado, si no, devuelve -1
// crossOriginIsolated.log ( array.indexOf (50) );

//? lastIndsexOf -> devuelve la ÚLTIMA pasición del elemento encontrado, si no devuelve -1
// console.log ( array.lastIndexOf (50) );

//? includes -> me vaa a indicar si algo existe o se incluye en el array que compruebe
// console. log ( array.includes (100) );

//? slice -> como el splice pero SIN modificar el array, este sólo puede recibir como mucho 2 parametros
//* array = [ 9, 50, 'eliminados', 10]
// posiciones 0   1        2        3
//                    x----------/

console.log ( array.slice (2, 2) );