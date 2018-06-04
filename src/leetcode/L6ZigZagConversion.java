package leetcode;

public class L6ZigZagConversion {

    public String convert(final String s, final int numRows) {
        if (numRows == 1) return s;
        final char[] ss = s.toCharArray();
        final StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        final int downstream = numRows;
        final int upstream = numRows - 2;
        int k = 0;
        while (k < ss.length) {
            for (int j = 0; j < downstream; j++) {
                if (k >= ss.length) break;
                sb[j].append(ss[k++]);
            }

            for (int j = upstream; j > 0; j--) {
                if (k >= ss.length) break;
                sb[j].append(ss[k++]);
            }
        }

        final StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}
