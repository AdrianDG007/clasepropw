const wizard = {name : 'Harry', house : 'Gryffindor', positon : 'Seeker'};

const { positon, ...rest} = wizard;
console.log (rest); // Output : { name : 'Harry', house : 'Gryffindor' }