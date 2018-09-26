package leetcode;

/**
 * Created by leo on 9/25/18.
 */
public class L318MaximumProductofWordLengths {

    public int maxProduct(final String[] words) {
        final int n = words.length;
        int max = 0;
        final int[] encodes = new int[n];
        for (int i = 0; i < n; i++) {
            encodes[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                encodes[i] |= 1 << words[i].charAt(j) - 'a';
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((encodes[i] & encodes[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
