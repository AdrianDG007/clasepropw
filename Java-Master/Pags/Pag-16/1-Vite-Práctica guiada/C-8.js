const addOptionsToColorPiker = () => {
  const colorPickerSelect = document.querySelectro ("#color-picker");

  colorPickerSelect.addEventListener ("change", (event) => {
    
    const newColor = envent.target.value;
    // Almacenamos el código de color

    document.body.style.backgroundColor = newColor;
    // Le aplicamos el background color con el código de color seleccionado

  });
};

addOptionsToColorPiker ();
addEventListenerToColorPiker ();