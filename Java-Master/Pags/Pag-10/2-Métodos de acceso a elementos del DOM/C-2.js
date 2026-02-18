// Obtiene un elemento por id
document.getElementsByClassName("someid");

// Obtiene una lista con los elementos con esa clase
document.getElementsByClassName ("someclass");

// Obtiene una HTMLCollection con todos los elementos "li"
document.getElementsByTagName ("li");

// Devuelve el primer elemento del documetno que cumpla la selección
// (la notación es como en css)
document.querySelector (".someclass");

// Devuelve una lista de elementos que cumplan con la selección 
// (la notacion es como en css)
document.querySelectorAll("div.note");
document.querySelectorAll("div.note, div.alert");