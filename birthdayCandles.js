/**
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
 *  They will only be able to blow out the tallest of the candles. 
 * Count how many candles are tallest.
 * 
 * input - an array of candle sizes
 * output -  a single integer n, that is the number of times the greatest size appears
 */

function birthdayCandles(candles){
    const candleCount = {};
    // callback that stores each element in the array as a key and its count as a value
    let countFunc = keys => {
        candleCount[keys] = ++candleCount[keys] || 1;
      }
    candles.forEach(countFunc);
   // console.log(candleCount)
    const numOccurences = Object.values(candleCount);
   // console.log(numOccurences);
    // find the largest value 
    const max = Math.max(...numOccurences);
    return max;
}

console.log(birthdayCandles([3,2,1,3]));