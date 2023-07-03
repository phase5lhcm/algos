// write a program to clone an array


let arr = [[1], [2]];
let arrCopy = JSON.parse(JSON.stringify(arr)); // allows for deep copies 
console.log(arrCopy);

// can also use slice for shallow copies