package leetcode;

import static org.junit.Assert.*;
import  org.junit.Test;

public class L283moveZeroesTest {

    @Test
    public void moveZeroes() throws Exception {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        L283moveZeroes instance = new L283moveZeroes();
        instance.moveZeroes(nums);
        assertArrayEquals(nums, expected);
    }
}