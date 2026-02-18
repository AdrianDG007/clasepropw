if (5 > 4) {
    let color = "rosa";
}

console.log(color); // undefined -> NO ES ACCESIBLE DESDE FUERA

if (5 > 4) {
    let color = "rosa";
    console.log(color); // rosa -> ES ACCESIBLE PORQUE ESTÁ DENTRO DE SU SCOPE
}

let color = "rosa";

if (5 > 4) {
    let color = "rosa";
    console.log(color); // rosa -> ES ACCESIBLE PORQUE COLOR ESTÁ A NIVEL GLOBAL
}