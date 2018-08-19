package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class L347TopKFrequentElements {

    public List<Integer> topKFrequent(final int[] nums, final int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (final int num : nums) {
            final int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        final PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(k + 1, (x, y) -> x.getValue() - y.getValue());
        for (final Map.Entry e : map.entrySet()) {
            pq.offer(e);
            if (pq.size() == k + 1) pq.poll();
        }

        final List<Integer> res = new ArrayList<>();
        while (pq.size() > 0) {
            res.add(pq.poll().getKey());
        }
        Collections.reverse(res);
        return res;
    }
}
