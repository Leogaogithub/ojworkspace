package leetcode;

public class L38CountandSay {

    public static void main(final String[] arg) {
        final L38CountandSay l2 = new L38CountandSay();
        System.out.print(l2.countAndSay(5));
    }

    public String countAndSay(final int n) {
        String cur = "1";
        for (int i = 1; i < n; i++) {
            cur = countString(cur);
        }
        return cur;
    }

    String countString(final String str) {
        final StringBuilder sb = new StringBuilder();
        final char[] c = str.toCharArray();
        int count = 1;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                count++;
            } else {
                sb.append(count);
                sb.append(c[i]);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c[c.length - 1]);
        return sb.toString();
    }
}
