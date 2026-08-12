import java.util.HashMap;

// 2958: Length of longest subarray with at most K frequency
// TC: O(n)

public class Prob_2958 {
    
    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        
        for (int right = 0; right < nums.length; right++) {
            
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++; 
            }

           
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3,1,2};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
}
