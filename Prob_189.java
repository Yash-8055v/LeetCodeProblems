

// 189: Rotate array k times
// TC: O(n)
// SC: O(1)

// Optimal Solution: Three Reversals (\(O(n)\) Time, \(O(1)\) Space) 

// To solve this in-place without extra memory, you can reverse parts of the array three times:
// 1. Normalize k: Use k = k % nums.length; (rotating a 7-element array 10 times is the same as rotating it 3 times).
// 2. Reverse the entire array: [1,2,3,4,5,6,7] \(\rightarrow \) [7,6,5,4,3,2,1]
// 3. Reverse the first k elements: [7,6,5, 4,3,2,1] \(\rightarrow \) [5,6,7, 4,3,2,1]
// 4. Reverse the remaining elements: [5,6,7, 4,3,2,1] \(\rightarrow \) [5,6,7,1,2,3,4]



class Prob_189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        int n = nums.length;
        k = k % n; // Handle cases where k >= n
        
        // 1. Reverse the whole array
        reverse(nums, 0, n - 1);
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        // 3. Reverse the rest of the elements
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
