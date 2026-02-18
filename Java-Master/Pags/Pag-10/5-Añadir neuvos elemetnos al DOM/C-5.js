// Seleccionamos un elemento
let cabecera = document.getElementById ("cabecare");

// Le añadimso los nodos hijos
cabecera.appendChild (nuevoH1);
cabecera.appendChild (nuevoParrafo);

// Recuperamos el padre del elemento
let padre = cabecera.parentNode;

//insertamos el h1 antes de la cabecera
padre.insertBefore (nuevoH1, cabecera);