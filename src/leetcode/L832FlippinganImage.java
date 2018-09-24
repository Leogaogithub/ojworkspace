package leetcode;

public class L832FlippinganImage {

    public int[][] flipAndInvertImage(final int[][] A) {
        for (int i = 0; i < A.length; i++) {
            reverseAndInvert(A[i]);
        }
        return A;
    }

    private final int[] reverseAndInvert(final int[] subArray) {
        int low = 0, high = subArray.length - 1;
        while (low <= high) {
            final int temp = subArray[low];
            subArray[low] = 1 - subArray[high];
            subArray[high] = 1 - temp;
            low++;
            high--;
        }
        return subArray;
    }
}
