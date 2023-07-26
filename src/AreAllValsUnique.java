/**
 * IsUnique / Contains Duplicate - LeetCode 217
 * Write a program to check if a sorted array of ascending values is unique or not.
 *
 * Example
 *
 * int[] intArray = {1,2,3,4,5,6};
 * isUnique(intArray) // true
 */
public class AreAllValsUnique {
    public static void main(String[] args){
        boolean isUnique= true;
        int pointer = 0;
        int[] arr = {2,3,4,5,6, 8, 8};

        for(int i = 1; i < arr.length; i++){
            if(arr[pointer] == arr[i]){
                System.out.println(isUnique);
            } else{
                pointer++;
                System.out.println(!isUnique);
            }
        }
    }

}
