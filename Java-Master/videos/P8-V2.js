function sayHello (firstName) {
    if (typeof firstName !== "string") {
        console.log ("Porfabor, introduce un string")
    } else {
        console.log ("Hello" + firstName)
    }
}

sayHello ("Alberto");
sayHello ("Antonio");
sayHello (5);

function countToNumber (startNum, endNum) {
    for (let i = startNum; i <= endNum; i ++) {
        console.log (i)
    }
}

countToNumber (2,5)

let age = 16;

function authAge () {
    if (age >= 18) {
        console.log ("Eres mayor de edad")
    } else {
        console.log ("No estás autorizado")
    }
}

authAge (19);
authAge (16)

function describeUser (user) {
console.log ("Tu nombre es: " + user.name);
console.log ("Tu edad es: "   + user.age);
console.log ("Vives en: "     + user.adress);
console.log ("Trabjas de: "   + user.job);
}

let fristUser = {
    name: "Bucre",
    age: 25,
    adress: "Barcelona",
    job: "Filantropo",
};

describeUser (fristUser);