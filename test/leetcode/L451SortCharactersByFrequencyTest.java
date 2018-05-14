package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.isIn;
import static org.junit.Assert.assertThat;

public class L451SortCharactersByFrequencyTest {

    L451SortCharactersByFrequency solution;

    @Before
    public void inital() {
        solution = new L451SortCharactersByFrequency();
    }

    @Test
    public void frequencySort() throws Exception {
        final String input1 = "tree";
        assertThat(solution.frequencySort(input1), is("eert"));
        assertThat(solution.frequencySort("cccaaa"), isIn(new String[]{"cccaaa", "aaaccc"}));
        assertThat(solution.frequencySort("Aabb"), isIn(new String[]{"bbAa", "bbaA"}));
    }
}