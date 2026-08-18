
// 3471: Find the Largest Almost Missing Integer
// TC: O(n)


import java.util.HashMap;

public class Prob_3471 {
    

     public static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> totalCounts = new HashMap<>();
        
        // Count total occurrences of each number in the array
        for (int num : nums) {
            totalCounts.put(num, totalCounts.getOrDefault(num, 0) + 1);
        }

        // Case 1: k equals the full length of the array
        // There is only 1 subarray, so the largest number is the answer
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }

        // Case 2: k is 1
        // Look for the largest number that appears exactly once in the entire array
        if (k == 1) {
            int maxVal = -1;
            for (int num : nums) {
                if (totalCounts.get(num) == 1) {
                    maxVal = Math.max(maxVal, num);
                }
            }
            return maxVal;
        }

        // Case 3: 1 < k < n
        // Only the first and last elements can belong to exactly one subarray.
        // They must also be unique (appear only once in the entire array).
        int maxVal = -1;
        if (totalCounts.get(nums[0]) == 1) {
            maxVal = Math.max(maxVal, nums[0]);
        }
        if (totalCounts.get(nums[n - 1]) == 1) {
            maxVal = Math.max(maxVal, nums[n - 1]);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int nums[] = {3,9,2,1,7};
        int k = 3;

        System.out.println(largestInteger(nums, k));
    }
}
