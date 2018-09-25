package leetcode;

/**
 * Created by leo on 9/24/18.
 */
public class L812LargestTriangleArea {

    public double largestTriangleArea(final int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    max = Math.max(max, areaDouble(points[i], points[j], points[k]));
                }
            }
        }
        return 0.5 * max;
    }

    double areaDouble(final int[] p1, final int[] p2, final int[] p3) {
        return Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1]));
    }
}
