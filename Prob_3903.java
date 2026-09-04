
// 3903: Smallest Stable Index 1
// TC: O(n) 

public class Prob_3903 {
    
    public static  int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return -1;

        // 1. Precompute the minimums from the right side (suffix min)
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // 2. Track the running maximum from the left and find the first stable index
        int maxSoFar = nums[0];
        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            int instabilityScore = maxSoFar - suffixMin[i];

            // Return the very first index that meets the condition
            if (instabilityScore <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {5,0,1,4};
        int k = 3;
        System.out.println(firstStableIndex(nums, k));
    }
}
