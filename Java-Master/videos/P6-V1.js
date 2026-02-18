let x = 10;

if (x === 11) {
    console.log("X es 10");
} else {
    console.log("X no es 10");
}

let age = 15;
let licence = true;

if (age >= 18 && licence){
    console.log ("Puedes conduci!")
} else if (age < 18 && licence) {
    console.log ("Te tienes que esperar a cumplir 18 años!")
} else if (age <= 18 && !licence) {
    console.log ("Tienes que sacarte el carnet de conducir!")
} else {
    console.log ("No puedes conducir")

}
