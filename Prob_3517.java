package LeetCodeProblems;

// 3517: Smallest Palindromic Rearrangement I
// TC: O(n)

public class Prob_3517 {

    public static  String smallestPalindrome(String s) {
        int[] counts = new int[26];
        
        // Count all characters in the string
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        
        StringBuilder firstHalf = new StringBuilder();
        String middle = "";
        
        // Build the first half lexicographically (from 'a' to 'z')
        for (int i = 0; i < 26; i++) {
            if (counts[i] % 2 != 0) {
                middle = String.valueOf((char) (i + 'a'));
            }
            // Put half of the paired characters into the first half
            for (int j = 0; j < counts[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }
        
        // Combine: First Half + Middle + Reversed First Half
        String first = firstHalf.toString();
        String second = firstHalf.reverse().toString();
        
        return first + middle + second;
    }
    public static void main(String[] args) {
        String str = "dcaacd";
        System.out.println(smallestPalindrome(str));
    }
}
