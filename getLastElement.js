//Write a JavaScript function to get the last element of an array.
// Passing the parameter 'n' will return the last 'n' elements of the array.

function getLastElement(arr, n){
    // if no array exists
  if(arr === null || !arr){
    return 'No array to work with'
  }
  if(n === null && arr.length >= 0){
    return arr.length-1;
  }
  if(n >= 0 && arr.length >=0){
    return arr.slice(-n)
  }
}

let arr = [6,5,4,3,2,6]

console.log(getLastElement([7, 9, 0, -2],3))