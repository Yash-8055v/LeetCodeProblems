import java.util.HashSet;
import java.util.Set;

// 2996: Smallest Missing Integer Greater Than Sequential Prefix Sum
// TC: O(n)

public class Prob_2996 {
    
    public static  int missingInteger(int[] nums) {
        int x = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);

        boolean prefixBroken = false; 
        
        for(int j = 1; j < nums.length; j++){
            if (!prefixBroken && nums[j] == nums[j - 1] + 1) 
            { 
                x += nums[j];
            }else {
                prefixBroken = true; 
            }
            set.add(nums[j]);
        }
        System.out.println(set.size());
        while(true){
            System.out.println(x);
            if(!set.contains(x)){
                return x;
            }
            x++;
        }

    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,12,14,13};

        System.out.println(missingInteger(nums));
    }
}

// import java.util.*;
// class Main {
//     public static int missingInteger(int[] nums) {
//         int x = nums[0];
//         Set<Integer> set = new HashSet<>();
//         set.add(nums[0]);

// // Use a flag to track if the prefix sequence is broken 
// boolean prefixBroken = false; 
        
//         for(int j = 1; j < nums.length; j++){
//             // Only add to the prefix sum if it hasn't been broken yet 
// if (!prefixBroken && nums[j] == nums[j - 1] + 1) 
// { 
// x += nums[j];
//  } 
// else {
//  prefixBroken = true; // Permanently break the prefix sum accumulation 
// }
//  // Always add all elements to the set for the missing number check set.add(nums[j]); 
//         }
        
//         while(true){
//             if(! set.contains(x)){
//                 return x;
//             }
//             x++;
//         }
//     }

//     public static void main(String[] args) {
//        int nums[] = {3,4,5,1,12,14,13};
//        System.out.println(missingInteger(nums));
//     }
// }

