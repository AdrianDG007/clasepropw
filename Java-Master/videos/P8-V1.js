function sayHello () {
    console.log ("Helo!")
}

function countToTen () {
    for (let i = 1; i <= 10; i ++) {
        console.log (i)
    }
}

let age = 16;

function authAge () {
    if (age >= 18) {
        console.log ("Eres mayor de edad")
    } else {
        console.log ("No estás autorizado")
    }
}

authAge ()