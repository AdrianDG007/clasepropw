const modal = document.getElementByld ("miModal");

function closeModal (event) {
    
    if (event.key === "Escape"){
        modal.style.display = "none";
    }
}

document.addEventListener ("keydown", closeModal);