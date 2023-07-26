import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Write a java program to remove duplicates from an array
 * Assume that the array is sorted
 * Input - an array of integers
 * Output - an array of unique elements
 */
public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr) {
        // our base case checks if the array is empty or has at most one element
        // if array has at most one, element, then there are no duplicates
        if (arr.length <= 1) {
            System.out.println("Array is either empty or does not contain any duplicates");
        }
        LinkedHashSet<Integer> uniqueArr = new LinkedHashSet<>();
        for (int j : arr) {
            uniqueArr.add(j);
        }
        //Creating an empty integer array
        Integer[] array = new Integer[uniqueArr.size()];
        //Converting Set object to integer array
        int j = 0;
        for (Integer i: uniqueArr) {
            array[j++] = i;
        }
        System.out.println(Arrays.toString(array));
        }
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,4,4,5};
        removeDuplicates(arr);
    }
}
