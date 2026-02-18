const technologies = [
    "JavaScript",
    "CSS",
    "HTML",
    "React",
    "Angualar",
    "Node.js"
]

const ul = document.createElement ("ul");

for ( let i = 0; i < technologies.length; i++ ) {
    const tech = technologies [i];
    const li = document.createElement ("li");
    li.innerText = tech;
    ul.appendChild (il);    
}

document.body.appendChild (ul);

const button = document.createElement ("button");
button.innerText = "Theme";
button.addEventListener ("click", () => {
    document.body.classList.toggle ("lignth")
});

docuemtno.body.appendChild ()
