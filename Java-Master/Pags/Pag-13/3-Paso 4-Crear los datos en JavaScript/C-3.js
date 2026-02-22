const tasks = [
    { description: "Ir a hacer la compra", completed: false },
    { description: "Crear el archivo html", completed: true },
    { description: "Arreglar el coche", completed: false },
    { description: "Crear proyecto millonario", completed: false },
    { description: "Enlazar el archivo js al HTML", completed: true },
    { description: "Ir al gimnasio", completed: true },
    { description: "Tejer una camiseta", completed: false },
    { description: "Ir a comprar agua", completed: false },
    { description: "Fregar los platos", completed: true }
];

const complete = (i) => {
    tasks[i].completed = true;
    orderTasks(tasks);
}

const printTasks = (tasksToPrint) => {
    const ul = document.querySelector(".list");
    ul.innerHTML = "";
    for (let i = 0; i < tasksToPrint.length; i++) {
        const task = tasksToPrint[i];
        const li = document.createElement("li");
        li.textContent = task.description;
        li.addEventListener("click", () => complete(i));
        if (task.completed === true) li.className = "completed";
        ul.appendChild(li);
    }
}

const orderTasks = (tasksToOrder) => {
    tasksToOrder.sort((a, b) => {
        if (a.completed && !b.completed) return 1;
        if (!a.completed && b.completed) return -1;
        return 0;
    });
    printTasks(tasksToOrder);
}

const button = document.querySelector(".new > button");

const addTask = () => {
    const input = document.querySelector(".new > input");
    const newTask = { description: input.value, completed: false };
    tasks.unshift(newTask);
    input.value = "";
    printTasks(tasks);
}

button.addEventListener("click", addTask);
orderTasks(tasks);