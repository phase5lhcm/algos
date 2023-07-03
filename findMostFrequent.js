//Write a JavaScript program to find the most frequent item in an array

function findMostFrequent(arr){
    const obj = {};
    let countFunc = keys => { obj[keys] = ++obj[keys] || 1 }
    arr.forEach(countFunc);
    for(ele in obj){
      console.log(ele)
    }


}
const arr = [3,3,3,6,7,2,2,2, 2]
console.log(findMostFrequent(arr))
