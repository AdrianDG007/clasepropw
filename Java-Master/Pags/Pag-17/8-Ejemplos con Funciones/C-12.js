const assembleAvengers = (...heroes) => {
  return heroes.join(', ');
}

console.log(assembleAvengers('Iron Man', 'Thor', 'Hulk', 'Black Widow')); // Output: Iron Man, Thor, Hulk, Black Widow