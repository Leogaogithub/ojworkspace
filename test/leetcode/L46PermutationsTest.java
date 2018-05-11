package leetcode;

import org.junit.Test;

import java.util.List;

public class L46PermutationsTest {

    @Test
    public void test1() throws Exception {
        final L46Permutations solution = new L46Permutations();
        final int[] input = {1, 2, 3};
        final List<List<Integer>> output = solution.permute(input);
        output.forEach(
                m -> {
                    m.forEach(
                            n -> System.out.print(n));
                    System.out.println("");
                }
        );
    }
}