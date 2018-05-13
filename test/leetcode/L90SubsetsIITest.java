package leetcode;

import org.junit.Test;

import java.util.List;

public class L90SubsetsIITest {

    @Test
    public void subsetsWithDup() {
        final L90SubsetsII solution = new L90SubsetsII();
        final int[] input = {2, 2, 1};
        final List<List<Integer>> output = solution.subsetsWithDup(input);
        Printer.print(output);
    }
}