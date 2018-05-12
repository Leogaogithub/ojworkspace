package leetcode;

import org.junit.Test;

import java.util.List;

public class L77CombinationsTest {

    @Test
    public void combine() throws Exception {
        final int n = 4;
        final int k = 2;
        final L77Combinations solution = new L77Combinations();
        final List<List<Integer>> output = solution.combine(n, k);
        Printer.print(output);
    }
}