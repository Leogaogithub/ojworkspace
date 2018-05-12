package leetcode;

import org.junit.Test;

import java.util.List;

public class L47PermutationsIITest {

    @Test
    public void permuteUnique() throws Exception {
        final L47PermutationsII solution = new L47PermutationsII();
        final int[] input = {1, 1, 3};
        final List<List<Integer>> output = solution.permuteUnique(input);
        Printer.print(output);
    }
}