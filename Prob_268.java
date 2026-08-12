
// 268: Missing Number
// TC: O(n)

public class Prob_268 {
    public static  int missingNumber(int[] nums) {
        int n = nums.length; //range
        int calSum = 0;
        int actualSum = (n * (n + 1)) / 2; // sum of natural n nos

        for(int i = 0; i < nums.length; i++){
            calSum += nums[i];
        }

        return actualSum - calSum;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
