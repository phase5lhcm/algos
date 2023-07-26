/**
 * Max Product of Two Integers
 * How to find maximum product of two integers in the array where all elements are positive.
 * Return an array of two values that when multiplied provide the maximum product
 * Example:
 * int[] intArray = {10,20,30,40,50};
 * maxProduct(intArray) // (40,50)
 *
 * it is also important to note that we can just find the two largest values since they will obviously create the max product
 */
public class MaxProduct {
    public static void main(String[] args){
        int[] arr = {1,2,5,3,1};
        int pointer = 0;
        int maxProduct = arr[pointer] * arr[pointer + 1];
        while(pointer < arr.length - 1){
            if(arr[pointer] * arr[pointer + 1] >= maxProduct){
                maxProduct = arr[pointer] * arr[pointer + 1];
                pointer++;
                System.out.println("The max product is " + maxProduct);
            } else{
                pointer++;
            }
        }
    }

}
