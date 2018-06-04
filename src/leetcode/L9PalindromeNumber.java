package leetcode;

public class L9PalindromeNumber {

    public boolean isPalindrome1(final int x) {
        if (x < 0) return false;
        final String xs = String.valueOf(x);
        return xs.equals(new StringBuilder(xs).reverse().toString());
    }

    public boolean isPalindrome(final int x) {
        if (x < 0) return false;
        int m = x;
        int reverse = 0;
        while (m != 0) {
            reverse = reverse * 10 + m % 10;
            m = m / 10;
        }
        return reverse == x;
    }
}
