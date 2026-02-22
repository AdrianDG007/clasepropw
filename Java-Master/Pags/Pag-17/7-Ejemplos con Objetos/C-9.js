const batman = {name : 'Bruce Wayne', alias : 'Batman'}
const superman = {name : '  Clark Kent', alias : 'Superman'};

const combinedHeros = {...batman,...superman};

console.log (combinedHeros); // Output : { name : 'Clark Kent', alias : 'Superman'}