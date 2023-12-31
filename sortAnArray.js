//Write a JavaScript program to sort the items of an array from smallest to largest
function sorter(arr){
    if(arr.length === 1){
        return arr
    }
    
    let leftArr = [];
    let rightArr = [];
    // pay attention to where you get your pivot from,
    // you must not include it when you begin sorting
    let pivot = arr[0]; 

    // i begins at 1 to exclude pivot
    for(let i = 1; i < arr.length; i++){
        if(arr[i] < pivot){
            leftArr.push(arr[i])
        } else {
            rightArr.push(arr[i])
        }
    }

    if(rightArr.length > 0 && leftArr.length > 0){
       return sorter([...leftArr], pivot, [...rightArr])
    } else if(leftArr.length > 0){
        return [...sorter(leftArr), pivot]
    } else {
        return [...sorter(rightArr), pivot]
    }
}

console.log(sorter([6,3,2,0,-5]))