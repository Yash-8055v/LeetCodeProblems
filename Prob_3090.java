
import java.util.HashMap;

// 3090: Maximum Length Substring With Two Occurrences
// TC: O(n)


public class Prob_3090 {

    public static int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            while(j < s.length() && map.getOrDefault(s.charAt(j), 0) < 2){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                j++;
            }
            if(j-i > maxLen){
                maxLen = j-i;
            }
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        }


        return maxLen;
    }
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(maximumLengthSubstring(s));
    }
}
