/**
 * Write a program  to check if an array contains a number in Java.
 * int[] intArray = {1,2,3,4,5,6};
 * searchInArray(intArray, 6); // 5
 */
public class FindNumInArr {
    public static void main(String[] args){
        int pointer = 0;
        int[] arr = {2,3,4,5,6};
        int target = 6;
        for(int i = 0; i < arr.length; i++){
            if(arr[pointer] == target){
                System.out.println("target value found: " + arr[pointer]);
            } else{
                pointer++;
            }
        }
    }

}
