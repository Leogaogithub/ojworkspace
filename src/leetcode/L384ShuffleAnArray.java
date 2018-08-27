package leetcode;

import java.util.Random;

/**
 * Created by leo on 8/26/18.
 */
public class L384ShuffleAnArray {

    Random rand = new Random();
    int[] origin;
    int[] copy;

    public L384ShuffleAnArray(final int[] nums) {
        origin = nums;
        copy = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        copy = origin.clone();
        return copy;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < copy.length; i++) {
            swap(copy, i, random(i, copy.length));
        }
        return copy;
    }

    private int random(final int min, final int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swap(final int[] array, final int i, final int j) {
        final int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
