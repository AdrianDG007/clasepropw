const objeto = {
    propiedad1: "lasdfla",
    propiedad2: "klsadflk"
}

const kays = Object.keys (objeto) // esto me cra un array con las claves de mi objeto -> [ 'propiedad1', 'propiedad2' ]

//puede ser bastante común
for (let i = 0; i < keys.length; i ++) {
    const key = keys [i];

    //console.log ( objeto [key] )
}

// recorremos el objeto 
for (const clave in objeto) {
    console.log (objeto [clave] );
    console.log (clave);
}