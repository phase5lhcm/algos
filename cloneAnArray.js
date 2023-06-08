// write a program to clone an array

let nestedNumbers = [[1], [2]];
let numbersCopy = JSON.parse(JSON.stringify(nestedNumbers));
console.log(numbersCopy);