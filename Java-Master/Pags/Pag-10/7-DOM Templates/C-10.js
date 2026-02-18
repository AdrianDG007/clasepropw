let name = "Peter Parker";
let job = "Frontend Developer";

// old school
console.log ("my name is" + name + "and my job is" + job);
// new way
console.log (`my name is ${name} and my job is ${job}`);

// Add to html
const contentApp = document.querySelector("#nameSelector");
let html =`<ul>
<li>name: ${name}</li>
<li>job:${job}</li>
</ull>`;

contentApp.innerHTML = html;