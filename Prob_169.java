
// 169: Majority Element
// TC: O(n)


public class Prob_169 {
    public static  int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
