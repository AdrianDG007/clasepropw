const user = {
    email: "user@user.com",
    password: "odsfofjowf"
}

// Objeto.keys me adevolverá un arraycon todas las claves
// del objeto que le amnde
const allTheKeysOfMyObject = Object.keys (user);
// allTheKeysOfMyObject = ["email","Password"]

//recorremos ese array de claves con el bucle
for (let i = 0; i < allTheKeysOfMyObject.length; i++) {

    // nos guardamos cada clave en cada vuelta
    const key = allTheKeysOfMyObject [i];

    // en vez de usar. para acceder a la propiedad de un objeto
    // usamos los corhcetes apra poder obtenre una propiedad
    // de nuestro objeto con la variable kay
    // que en cada vuelta del bucle será una clave del objeto
    console.log ( user [key] );

}