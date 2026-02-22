const mutant = { name : 'Loga', alias : 'Wolverine', team : 'X-Men'};
const {alias, ...rest} = mutant;
const droids = ['R2-D2', 'C-3PO', 'bb-8'];

function repairDroids (repairman, ...droids) {
    return `Repairman ${repairman} will fix : ${ droids.join (',') }`;
}

console.log ( repairDroids ('Anakin', ...droids) );