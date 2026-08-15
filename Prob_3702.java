
// 3702: Longest Subsequence With Non-Zero Bitwise XOR
// TC: O(n)

public class Prob_3702{

    public static int longestSubsequence(int[] nums) {
        int totalXOR = 0;
        boolean hasNonZero = false;
        int n = nums.length;

        // One pass to calculate total XOR and check for non-zero elements
        for (int num : nums) {
            totalXOR ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }

        // Case 1: Every element is zero
        if (!hasNonZero) {
            return 0;
        }

        // Case 2: Entire array has a non-zero XOR sum
        if (totalXOR != 0) {
            return n;
        }

        // Case 3: Total XOR is 0, remove exactly one non-zero element
        return n - 1;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,4};
        System.out.println(longestSubsequence(nums));
    }

    // NOTE:  A xor 0 = A -> xor of any no with zero gives same no
}