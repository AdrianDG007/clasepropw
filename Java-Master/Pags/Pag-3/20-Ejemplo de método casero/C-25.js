let email = "email@email.com";

console.log( email.includes ("@") ); // true

let selncluye = false;

for ( let i = 0; i < email.length; i++) {
    let char = email[i];

    if (char === "@") {
        selncluye = true;
    }
}

console.log(selncluye); // true