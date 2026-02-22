const lista = ["elemento1", "elemento2", "elemento3", "elemento4"];

cosnt [ el1, ...resto ] =lista

console.log (el1);
console.log (resto);


const sum = (...allNums) => {
    let suma = 0;
    for (const num of allNums) {
        suma += num
    }
    console.log (suma);
}

sum (32, 23, 23, 23, 23, 212);
sum ( 12, 21, 32);