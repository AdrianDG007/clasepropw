// lo más común al utilizar bucles es recorrer un array 

const unbers = [ 23, 23, 23, 23, 2323, 23, 23]; // 7
// posiocones    0   1   2   3    4    5   6

// muy común
for ( let i = numbers.length - 1 ; i >= 0; i -- ) {

    let number = numbers [i]
    
    console.log (number);

}

// la i empieza en 0, va hasta la logitud del arrya que le haya indicado
// (numbers) declara una variable (nuimber) con el valor de numbers [i]
for (const number of numbers) {
    console.log  ( number);
}