package leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class L389FindTheDifferenceTest {

    static L389FindTheDifference solution;
    @Before
    public void setUp() throws Exception {
        solution = new L389FindTheDifference();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findTheDifference() {
        String s = "abcd";
        String t = "abcde";
        char expected = 'e';
        char result = solution.findTheDifference(s,t);
        assertThat(expected, is(result));
    }
}