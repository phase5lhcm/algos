/**
 * Create a function that returns both the sum and product of all elements in an array
 * */
public class SumAndProductArray {
    public static int sumAllElements(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return  sum;
    }

    public static int multiplyAllElements(int[] arr){
        int product = 0;
        int pointer = 0;
        for(int i = 1; i < arr.length; i++){
            product *= arr[i] * arr[pointer];
            pointer++;
        }
        return product;
    }

    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        System.out.println("Add all elements: " + sumAllElements(arr));
        System.out.println("Multiply all elements: " + multiplyAllElements(arr));

    }
}
