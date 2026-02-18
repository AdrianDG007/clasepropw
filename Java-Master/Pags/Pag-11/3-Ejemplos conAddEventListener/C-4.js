const select = document.getElementById ("miSelect");

function handlePressdKey () {
    const seleccion = select.ariaValueMax;
    console.log ("Selección cambiada a;" + seleccion);
}

select.addEventListener ("change", handleSelect);