//Write a JavaScript program that accepts a number as input and inserts dashes (-) between each even number. 
// For example if you accept 025468 the output should be 0-254-6-8.

function insertDashes(num){
    const cloneNums = [...num+''].map(n=>n); // separate into digits
    let numsWithDashes = []; 
    for(let i =0; i < cloneNums.length; i++){
        if(cloneNums[i] % 2 === 0 && (cloneNums[i-1]%2 === 0)){
            numsWithDashes.push('-', cloneNums[i]);
        }else {
         numsWithDashes.push(cloneNums[i]);
        }
    }
    return numsWithDashes.join('');
}

console.log(insertDashes(128546))