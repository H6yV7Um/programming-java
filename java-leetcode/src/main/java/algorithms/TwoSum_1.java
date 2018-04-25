package algorithms;


import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers,return indices of the two numbers such that
 * they add up to a specific target.You may assume that each input would
 * have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum_1 {

    /**
     * Brute Force
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {

                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {

//        int[] nums = {2, 7, 11, 15};
//        int[] nums = {3, 3};
        int[] nums = {2, 5, 5, 11};
//        int target = 6;
//        int target = 9;
        int target = 10;
        int[] a = new TwoSum_1().twoSumBruteForce(nums, target);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
