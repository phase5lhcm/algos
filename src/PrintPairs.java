/**
 * Write a function that prints out the pairs of elements in an array
 *
 * Time Complexity - O(N^2) since we are using a nested loop for the same input array
 * Space Complexity - O(1) since we do not create any new space
 */
public class PrintPairs {
   public static void main(String[] args){
      int[] arr = {1,2,3,4};

      for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
           System.out.println(arr[i] + " " + arr[j]);
        }
      }
   }
}
