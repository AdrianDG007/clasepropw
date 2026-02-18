const coche = {
    color: "Rojo",
    marca: "Seat",
    ruedas: 4,
    puertas: 5,
    garantia: {
        fechaLimite: "2025-12-20/12/2024",
        precioLimite: 2342,
        compania:{
            nombre: "segurosThePower",
            sucursales: ["Madrid", "Barcelona","Murcia", "Valencia"]
        }
    }
}

console.log(coche.garantia.compania.sucursales.length + "sucursales tiene la compañia de seguros"); 
// 4 sucursales tiene la compañia 