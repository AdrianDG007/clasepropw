const fechaActual = new Date();
const fechaFormateada = fechaActual.toLocaleDateString('es-ES');
console.log(fechaFormateada); // Muestra la fecha formateada según la configuración regional