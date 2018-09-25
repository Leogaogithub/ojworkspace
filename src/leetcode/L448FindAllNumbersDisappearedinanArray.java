package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leo on 9/24/18.
 */
public class L448FindAllNumbersDisappearedinanArray {

    public List<Integer> findDisappearedNumbers(final int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curSwape = nums[i];
            while (curSwape != nums[curSwape - 1]) {
                final int temp = nums[curSwape - 1];
                nums[curSwape - 1] = curSwape;
                curSwape = temp;
            }
        }

        final List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
