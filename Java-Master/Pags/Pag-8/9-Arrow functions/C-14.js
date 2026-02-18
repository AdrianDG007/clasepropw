const getName = () => {
    console.log ("Devolviendo nombre");
    return "Carlos"
}

const name = getName ();

console.log (name);

// Ejemplo inline (omitiendo el return)ç
const getSurname = () =>"Martín";

const surname = getSurname ();

console.log (surname);