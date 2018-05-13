package leetcode;

import org.junit.Test;

import java.util.List;

public class L78SubsetsTest {

    @Test
    public void subsets() {
        final L78Subsets solution = new L78Subsets();
        final int[] input = {1, 2, 3};
        final List<List<Integer>> output = solution.subsets(input);
        Printer.print(output);
    }
}