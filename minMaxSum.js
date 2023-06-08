/**
 * Given five positive integers, 
 * find the minimum and maximum values 
 * that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

const minMaxSum = (arr) =>{
    // since we have five values in our array, we do not need to implement an algorithm to sort it
    let maxVal = arr[0]; // they can be anything
    let minVal = arr[0];
    let sum = 0;

    for(let i = 0; i < arr.length; i++){
        if(maxVal < arr[i]){
            maxVal = arr[i];
        }
        if(minVal > arr[i]){
            minVal = arr[i]
        }
        // total sum
        sum += arr[i];
    }

    let maxSum = sum - minVal;
    let minSum = sum - maxVal;

    return `hh ${minSum} ${maxSum}`;

}

console.log(minMaxSum([2,5,7,2,70]));