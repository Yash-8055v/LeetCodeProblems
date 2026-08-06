package LeetCodeProblems;

    // 3345: Smallest Divisible Digit Product I
    
    // TC: O(t . log10 n)
    // log10 n => no of digits in n
    // t => max no of rec steps

public class Prob_3345 {
    
    public static int smallestDivisibleDigitProduct(int n, int t) {
    while (true) {
        if (getDigitProduct(n) % t == 0) {
            return n;
        }
        n++; // Safely increments to check the next number
    }
}

private static int getDigitProduct(int num) {
    if (num == 0) return 0; // Handle edge case explicitly
    
    int prod = 1;
    while (num > 0) {
        int digit = num % 10;
        if (digit == 0) return 0; // Early exit: Multiplying by 0 always results in 0
        prod *= digit;
        num /= 10;
    }
    return prod;
}


    public static void main(String[] args) {
        int n = 10, t = 2;
        System.out.println(smallestDivisibleDigitProduct(n, t));
    }
}
