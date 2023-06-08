// implement Quicksort to sort an array

function quickSort(arr){
    // edge case
    if(arr.length === 1){
        return arr
    }

    // identify the value that will be used to compare each value to
    // this will be used to separate the initial array into two arrays
    // seriously, it can be any value in our array
    const pivot = arr[arr.length-1];
    const leftArr = [];
    const rightArr = [];

    // start pushing your values into their respective array by comparing to the pivot
    for(let i = 0; i < arr.length - 1; i++){
        if(arr[i] < pivot){
            leftArr.push(arr[i])
        } else{
            rightArr.push(arr[i])
        }
    }

    // at this point we will have two arrays but it is possible that one array can have 0 values and the other have all the values
    if(leftArr.length > 0 && rightArr.length > 0){
        return [...quickSort(leftArr), pivot, ...quickSort(rightArr)]
    } else if(leftArr.length > 0){
        return [...quickSort(leftArr), pivot]

    } else {
        return [...quickSort(rightArr), pivot]

    }
}

console.log(quickSort([5,3,0, 89,21,0, 74,2,4]));