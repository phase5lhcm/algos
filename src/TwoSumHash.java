import java.util.Arrays;
import java.util.HashMap;

/**
 * Two Sum - LeetCode 1
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
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
 * T/C for solution
 * O(N) space complexity since we create more space for the hashmap
 * O(N) time complexity since the time to find the two keys (indicies) depends on the time it takes to iterate thru N
 * */
public class TwoSumHash {
 public static int[] getIndices(int[] unsortedArr, int target){
     HashMap<Integer, Integer> hashMap = new HashMap<>();
     int[] idicies = new int[2];
     for(int i = 0; i < unsortedArr.length; i++){
         Integer missingVal = target - unsortedArr[i];
         if(hashMap.containsKey(missingVal)){
             idicies = new int[]{hashMap.get(missingVal), i + 1};
         }

         hashMap.put(unsortedArr[i], i);
     }
     return idicies;
 }
  public static void main(String[] args){
     int[] twoSumVals = {2,3,1,6,8,4};
      System.out.println(Arrays.toString(getIndices(twoSumVals, 6)));
  }


}
