const campoTexto = document.getElementById ("miCampoTexto");

function handlePressdKey (event) {
    console.log ("Tecla presionada" + event.key);
}

campoTexto.addEventListener ("keydown",handlePressdKey);