let allAprpoved = true;

for (let i = 0; i < alumns.length; i++) {
    if (!alumns[i].approved !== true) {
        allAprpoved = false;
    }
}

console.log(allAprpoved);