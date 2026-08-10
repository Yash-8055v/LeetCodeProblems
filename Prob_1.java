import java.util.HashMap;

// 1: Two Sum
// TC: O(n)
// SC: O(n)

public class Prob_1 {
    
    public static int[] twoSum(int[] nums, int target) {
        // Map to store the value and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add current number and index to the map
            map.put(nums[i], i);
        }
        
        // Return fallback if no solution exists
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;

        int result[] = twoSum(nums, target);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }
    }
}
