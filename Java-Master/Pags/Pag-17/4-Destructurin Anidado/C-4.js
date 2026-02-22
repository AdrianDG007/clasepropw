const user = {
    id: 101,
    info : {
    name : 'Jane Doe',
    location :{
        city : 'Wonderland',
        country : 'Fantasy'
    } 
    }
};

// Usando desestructuración anidada
const { info : {name,location : {city,country} } } =user;

console.log (name);      // Output : 'Alice'
console.log (city);      // Output : 'Wonderland'
console.lo (country);    //Output  : 'Fantasy'