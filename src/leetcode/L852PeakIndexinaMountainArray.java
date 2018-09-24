package leetcode;

/**
 * Created by leo on 9/23/18.
 */
public class L852PeakIndexinaMountainArray {

    public int peakIndexInMountainArray(final int[] A) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            final int mid = (high + low) / 2;
            if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
                return mid;
            } else if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid + 1;
            }
        }
        return low;
    }
}
