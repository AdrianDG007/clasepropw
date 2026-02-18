// Recuperamos un elemento
let cabecera = document.getElementById ("cabecera");

// Elimina una clsae del elemento
cabecera.classList.remove ("foo");

// Añade una clase si no existe
cabecera.classList.add("otra");

// Añade o elimina varias clases a la vez
cabecera.classList.add ("foo", "bar");
cabecera.classList.remove ("foo", "bar");

// Si la clase existe la elimina, si no existe, la crea
cabecera.classList.toggle ("visible");

// Devuelve true si el elemento contiene esa clase
cabecera.classList.contains ("foo")