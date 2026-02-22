const teamUp = (leader, ...members) => {
  console.log(`Leader: ${leader}`);
  console.log(`Members: ${members.join(', ')}`);
}

teamUp('Professor X', 'Cyclops', 'Wolverine', 'Storm');
// Output:
// Leader: Professor X
// Members: Cyclops, Wolverine, Storm

