
// 67: Add Binary
// TC: O(max(N,M)) where N,M are the len of string a,b
// SC: O(max(N,M)) to store op string

public class Prob_67 {
    
    public static  String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry > 0){
            int total = carry;
            if(i >= 0){
                total += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                total += b.charAt(j) - '0';
                j--;
            }

            result.append(total % 2);
            carry = total / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "10010";
        String b = "11010";

        System.out.println(addBinary(a, b));

    }
}
