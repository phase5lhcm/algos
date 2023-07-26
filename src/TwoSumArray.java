import java.util.Arrays;

/**
 * Two Sum - LeetCode 1
 * Given an array of sorted integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Examples
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 *
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 */
public class TwoSumArray {
    public static int[] getIndices(int[] arr, int target){
      int[] twoSumIndices = new int[2];

      for(int i = 1; i < arr.length-1; i++){
        if(arr[i] + arr[i + 1] != target){
        } else{
            twoSumIndices = new int[]{i+1, i};
        }

      }
      return twoSumIndices;
    }

    public static void main(String[] args){
        int[] twoSumVals = {2,3,1,6,8,4};
        System.out.println(Arrays.toString(getIndices(twoSumVals, 12)));
    }

}
