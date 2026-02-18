let myFun = new Function ('5 + 2');
let shape = 'round';
let size = 1;
let food =["Apple", "Mango", "Orange"];
let today = new Date();

typeof myFun;        // "function"
typeof shape;        // "string"
typeof size;         // "number"
typeof food;         // "object"
typeof today;        // "object"
typeof doesNotExist; // "undefined"

typeof true;         // "boolean"
typeof null;         // "object"