package leetcode;

public class L443StringCompression {

    public int compress(final char[] chars) {
        int i = 0;
        int j = 0;
        int count = 1;
        while (j < chars.length) {
            if (j + 1 < chars.length && chars[j] == chars[j + 1]) {
                count++;
            } else {
                chars[i++] = chars[j];
                if (count > 1) {
                    for (final char c : String.valueOf(count).toCharArray()) {
                        chars[i++] = c;
                    }
                }
                count = 1;
            }
            j++;
        }

        return i;
    }
}
