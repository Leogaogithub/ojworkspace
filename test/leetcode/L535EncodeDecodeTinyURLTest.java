package leetcode;

import org.junit.Test;

public class L535EncodeDecodeTinyURLTest {

    String PREFIX = "https://leetcode.com/problems/design-tinyurl/";

    @Test
    public void encode() {
        final L535EncodeDecodeTinyURL solution = new L535EncodeDecodeTinyURL();

        int size = 5;
        while (--size != 0) {
            System.out.println("-----------------------");
            System.out.println("encode");
            final String url = PREFIX + size;
            String shorturl = solution.encode(url);
            line(url, shorturl);
            shorturl = solution.encode(url);
            line(url, shorturl);
            System.out.println("decode");
            line(shorturl, solution.decode(shorturl));
            line(shorturl, solution.decode(shorturl));
        }
    }

    void line(final String input, final String output) {
        System.out.println(input + " -> " + output);
    }
}