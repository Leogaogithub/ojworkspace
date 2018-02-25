package leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class L371SumofTwoIntegersTest {
    static L371SumofTwoIntegers solution;
    @Before
    public void setUp() {
        solution = new L371SumofTwoIntegers();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void getSum(){
        int a = 7;
        int b = 9;
        assertThat(a+b, is(solution.getSum(a,b)));
    }
}