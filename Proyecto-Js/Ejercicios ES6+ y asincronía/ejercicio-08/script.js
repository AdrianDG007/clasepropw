// ========================================
// EJERCICIO ES6+ 8 - Fetch a API de Game of Thrones
// ========================================

const select = document.getElementById("character-list");
const imagen = document.querySelector(".character-image");

// fetch devuelve una Promise
// .then() se ejecuta cuando la petición termina bien
// async/await es una forma más limpia de trabajar con Promises

async function cargarPersonajes() {
  try {
    // Hacemos la petición a la API
    const respuesta = await fetch("https://thronesapi.com/api/v2/Characters");

    // .json() convierte la respuesta en un objeto JavaScript (también es async)
    const personajes = await respuesta.json();

    // Limpiamos el select antes de añadir los personajes
    select.innerHTML = '<option value="">-- Elige un personaje --</option>';

    // Creamos una opción por cada personaje
    for (let personaje of personajes) {
      const opcion = document.createElement("option");
      opcion.value = personaje.imageUrl; // guardamos la URL de la imagen como valor
      opcion.textContent = personaje.fullName;
      select.appendChild(opcion);
    }

  } catch (error) {
    // Si algo falla (sin internet, API caída...) lo mostramos
    console.error("Error al cargar personajes:", error);
    select.innerHTML = '<option>Error al cargar personajes</option>';
  }
}

// Cuando el usuario cambia la selección, mostramos la imagen
select.addEventListener("change", function (evento) {
  const urlImagen = evento.target.value;

  if (urlImagen) {
    imagen.src = urlImagen;
    imagen.style.display = "block"; // hacemos visible la imagen
  } else {
    imagen.style.display = "none";
  }
});

// Llamamos a la función al cargar la página
cargarPersonajes();
