/**
 * Given 2D array calculate the sum of diagonal elements left to right.
 *
 * Example
 *
 * myArray2D= {{1,2,3},
 *             {4,5,6},
 *             {7,8,9}};
 *
 * sumDiagonalElements(myArray2D) #
 */
public class SumDiagonals {
    public static int sumDiagonals(int[][] arr){
        int sum = 0;
        int numRows = arr.length;

        for (int i = 0; i < numRows; i++) {
            System.out.println(arr[i][i]);
            // arr[i][i] corresponds to the row and column because the second i allows us to enter each row
            sum += arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arrToPrint = {{1,2,3},{4,5,6},{7,8,9}};
        int test = sumDiagonals(arrToPrint);
        System.out.println(test);

    }
}
