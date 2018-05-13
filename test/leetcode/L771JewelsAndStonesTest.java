package leetcode;

import org.junit.Test;

public class L771JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() throws Exception {
        String J = "aA";
        String S = "aAAbbbb";
        final L771JewelsAndStones solution = new L771JewelsAndStones();
        System.out.println(solution.numJewelsInStones(J, S));

        J = "z";
        S = "ZZ";
        System.out.println(solution.numJewelsInStones(J, S));
    }
}