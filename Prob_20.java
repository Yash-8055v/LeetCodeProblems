import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 20: Valid parentheses
// TC: O(n)

public class Prob_20 {
    

    public static boolean isValid(String s) {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (bracketMap.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                
                if (topElement != bracketMap.get(c)) {
                    return false; 
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "())";
        System.out.println(isValid(str));
    }
}
