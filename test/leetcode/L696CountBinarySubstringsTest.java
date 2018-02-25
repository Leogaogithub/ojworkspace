package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class L696CountBinarySubstringsTest {

    L696CountBinarySubstrings solution;

    @Before
    public void init(){
        solution = new L696CountBinarySubstrings();
    }

    @Test
    public void countBinarySubstrings() {
        String input = "00110011";
        assertThat(solution.countBinarySubstrings(input), is(6));
    }
}