/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, 
 * determine the number of apples and oranges that land on Sam's house.

When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. 
* A negative value of  means the fruit fell  units to the tree's left,
 and a positive value of  means it falls  units to the tree's right. 

 Function Description

Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.
Input Format

The first line contains two space-separated integers denoting the respective values of  and .
The second line contains two space-separated integers denoting the respective values of  and .
The third line contains two space-separated integers denoting the respective values of  and .
The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point .
The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .
 */

function countApplesAndOranges(s, t, a, b, apples, oranges){
    // declare two variables to store the count for each fruit that falls within range s & t
    let appleCount = 0;
    let orangeCount = 0;

    // loop thru each arr and add each value to a or b, 
    // if this value is between the range of Sam's house, we add one to the count

    for(let i = 0; i < apples.length; i++){
        let appleRange = apples[i] + a;
        if(appleRange >= s && appleRange <= t){
            console.log(appleRange)
            appleCount += 1;
        }
    }

    for(let i = 0; i < oranges.length; i++){
        let orangeRange = oranges[i] + b;
        if(orangeRange >= s && orangeRange <= t){
            console.log(orangeRange)
            orangeCount += 1;
        }
    }

    return [appleCount, orangeCount];
}

console.log(countApplesAndOranges(7,11,5,15, [-2,2,1], [5,-6]));