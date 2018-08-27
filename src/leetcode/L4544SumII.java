package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo on 8/25/18.
 */
public class L4544SumII {

    public int fourSumCount(final int[] A, final int[] B, final int[] C, final int[] D) {
        final Map<Integer, Integer> abMap = new HashMap<>();
        final Map<Integer, Integer> cdMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                abMap.put(A[i] + B[j], abMap.getOrDefault(A[i] + B[j], 0) + 1);
                cdMap.put(C[i] + D[j], cdMap.getOrDefault(C[i] + D[j], 0) + 1);
            }
        }
        int count = 0;
        for (final Map.Entry<Integer, Integer> e : abMap.entrySet()) {
            count += cdMap.getOrDefault(-e.getKey(), 0) * e.getValue();
        }
        return count;
    }
}
