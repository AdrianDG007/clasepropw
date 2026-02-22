const ironMan = { name : 'Tony Stark', suit : 'Mark I' };
const updatedIronMan = { ...ironMan, suit : 'Mark L'};

console.log (updatedIronMan) // Output : { name : 'Tony Stark', suit : 'Mark L'}