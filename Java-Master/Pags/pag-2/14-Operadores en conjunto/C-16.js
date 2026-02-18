console.log(true && true || false || true && true && false); // true

// paso 1;
// true && true = true
// simplificamos
console.log(true || false || true && true && false); 

// paso 2;
// true && true && false = false
// simplificamos
console.log(true || false || false);

// paso 3;
// true || false || false = true