const mutant = { name : 'Loga', alias : 'Wolverine', team : 'X-Men'};
const {alias, ...rest} = mutant;

console.log (alias); // Output : 'Wolverine'
console.log (rest);  // Output : {name : 'Logan', team : 'X-Men'}ç
