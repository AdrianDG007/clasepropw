const person = {
    name       : 'Jane Doe',
};

// Usando desestructuración con valores por defecto
const {name, age = 25} = person;

console.log (name); // Output : 'Jane Doe'
console.log (age);  // Output : 25 (valor por defecto)