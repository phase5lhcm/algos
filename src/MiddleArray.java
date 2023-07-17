import java.sql.Array;

// Write a function called middle that takes an array and returns a
// new array that contains all but the first and last elements.
//myArray = [1, 2, 3, 4]
//middle(myArray)  # [2,3]

/**
 * Time/space complexity is:
 * Time: O(N) i.e the time it takes to copy the middle values is dependent on the size of the input
 * Space: O(N) we create a new array, middleArr to hold the middle values
 */
public class MiddleArray {

    static int[] middle(int[] array){
        // our base case in case the array does not actually have a middle value
        if(array.length <= 2){
            return new int[0];
        }

        //
        int[] middleArr = new int[array.length - 2];
        for(var i = 1; i < array.length-2; i++){
            // we want our middle array to begin at the zeroth position,
            // but array is not being iterated from the zeroth postion,
            // hence the reason why we 'shift' each value i in array
            // when we move it into middleArr
            middleArr[i-1] = array[i];
        }
        return  middleArr;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7};
        int[] newMiddleArr = middle(arr);
        System.out.println(newMiddleArr);
    }
}
