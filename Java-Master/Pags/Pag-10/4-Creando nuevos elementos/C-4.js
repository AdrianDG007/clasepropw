// Para crear elementos utilizamos el métodos createElement pasándole el nombre del tag
let nuevoH1 = document.createElement ("h1");
let nuevoParrafo = document.createElement ("p");

// Podemos crear nodos de texto para un elemento
let textoH1 = document.createTextNode ("Hola mundo!");
let textopParrafo = document.createTextNode ("lorem ipsum");

// Podemos añadir un nodo como hijo a otro nodo ya existente
nuevoH1.appendChild (textoH1);
nuevoParrafo.appendChild (textoParrafo);

// También podemos asignar directametne el valor con las propiedades innerHTML
nuevoH1.innerHTML = textoH1;
nuevoParrafo.innerHTML = textoParrafo;

// Los elemetnos estarían listos apra añadirlos al DOM
// ahgora mismo sólo existen en memoria, pero no serán visibles hasta
// que no los añados a un elemento del DOM