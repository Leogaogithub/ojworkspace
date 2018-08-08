package leetcode;

public class L171ExcelSheetColumnNumber {

    public int titleToNumber(final String s) {
        final char[] digits = s.toCharArray();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            final int num = digits[i] - 'A' + 1;
            result = result * 26 + num;
        }
        return result;
    }
}
