// Write a JavaScript function to get the first element of an array. 
// Passing the parameter 'n' will return the first 'n' elements of the array.

function getFirstElement(arr, n){
    // if no array exists
  if(arr === null || !arr){
    return 'No array to work with'
  }
  if(n === null && arr.length >= 0){
    return arr;
  }
  if(n > 0 && arr.length >=0){
    return arr.slice(0, n)
  }

}

console.log(getFirstElement([0,0], 7))