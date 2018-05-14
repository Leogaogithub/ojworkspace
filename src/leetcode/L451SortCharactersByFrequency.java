package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class L451SortCharactersByFrequency {

    int maxFrequence = 0;

    public String frequencySort(final String s) {
        return frequencySort2(s);
    }

    // 48 ms 49%
    public String frequencySort2(final String s) {
        maxFrequence = 0;
        final Map<Character, Integer> countMap = getCharacterCountMap(s);
        //return bucketSortMap(countMap, s.length());
        //
        // improve it by use maxFrequence instead of s.length
        // 55 ms, actually no improvement here.
        return bucketSortMap(countMap, maxFrequence + 1);
    }

    // sort1 heap sort 4.17%
    public String frequencySort1(final String s) {
        final Map<Character, Integer> countMap = getCharacterCountMap(s);
        return heapSortMap(countMap);
    }

    Map<Character, Integer> getCharacterCountMap(final String s) {
        final Map<Character, Integer> countMap = new HashMap<>();
        for (final char c : s.toCharArray()) {
            Integer count = countMap.getOrDefault(c, 0);
            count++;
            maxFrequence = Math.max(count, maxFrequence);
            countMap.put(c, count);
        }
        return countMap;
    }

    String bucketSortMap(final Map<Character, Integer> countMap, final int size) {
        final List<Character>[] buckets = new List[size + 1];
        for (final Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            final int frequence = entry.getValue();
            if (buckets[frequence] == null) {
                buckets[frequence] = new ArrayList<>();
            }
            buckets[frequence].add(entry.getKey());
        }

        final StringBuilder sb = new StringBuilder();
        for (int f = buckets.length - 1; f > 0; f--) {
            if (buckets[f] == null) {
                continue;
            }
            for (final Character c : buckets[f]) {
                for (int j = 0; j < f; j++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    String heapSortMap(final Map<Character, Integer> countMap) {
        final PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(
                (x, y) -> y.getValue() - x.getValue()
        );
        priorityQueue.addAll(countMap.entrySet());
        final StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            final Map.Entry<Character, Integer> entry = priorityQueue.poll();
            // solution 1 : 133ms 4.17%
            // sb.append(new String(new char[entry.getValue()]).replace("\0", entry.getKey().toString()));
            // solution 2 : 124 ms 6.64%
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
