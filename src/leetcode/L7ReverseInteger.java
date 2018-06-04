package leetcode;

public class L7ReverseInteger {

    public static int reverse(final int x) {
        final StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(Long.valueOf(x))));
        sb.reverse();
        final Long res = x > 0 ? Long.valueOf(sb.toString()) : -Long.valueOf(sb.toString());
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return res.intValue();
    }

    public static int reverse2(final int x) {
        int y = x;
        int res = 0;
        while (y != 0) {
            final int newres = res * 10 + y % 10;
            if ((newres - y % 10) / 10 != res) return 0;
            y /= 10;
            res = newres;
        }
        return res;
    }

    public static void main(final String[] arg) {
        System.out.print(L7ReverseInteger.reverse2(-214748364));
    }
}
