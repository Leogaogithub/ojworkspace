package leetcode;

/**
 * Created by leo on 9/24/18.
 */
public class L788RotatedDigits2 {

    int rotates[] = {0, 1, 8, 2, 5, 6, 9};
    int result = 0;

    public static void main(final String[] arg) {
        final int x = Integer.parseInt("099");
        System.out.print(x);
    }

    public int rotatedDigits(final int N) {
        result = 0;
        final int digits = Integer.toString(N).length();

        for (int i = 1; i <= digits; i++) {
            help(i, new StringBuilder(), N);
        }
        return result;
    }

    void help(final int digits, final StringBuilder sb, final int N) {
        if (sb.length() == digits) {
            if (isGood(sb, N)) {
                result++;
            }
            return;
        }
        int i = 0;
        if (sb.length() == 0) {
            i = 1;
        }

        for (; i < rotates.length; i++) {
            sb.append(rotates[i]);
            help(digits, sb, N);
            sb.setLength(sb.length() - 1);
        }
    }

    boolean isGood(final StringBuilder sb, final int N) {
        final String s = sb.toString();
        final int num;
        try {
            num = Integer.parseInt(s);
        } catch (final Exception e) {
            return false;
        }
        if (num > N) return false;
        if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
            return true;
        }

        return false;
    }
}
