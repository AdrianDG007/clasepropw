const person = {
    name       : 'john Doe',
    age        : 30,
    profession : 'Developer'
};

// Asignación tradicional
const presonName = person.name;
const perosnAge  = person.age;

// Usando desstructuración
const {name,age,profession} = person;

console.log (name);      // Output  : 'John Doe'
console.log (age);       // Output  : 30
console.log (prfession); // Output  : 'Developer'