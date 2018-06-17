package leetcode;

public class L42TrappingRainWater {

    public int trap(final int[] height) {
        if (height.length < 2) return 0;
        int l = 0;
        int r = height.length - 1;
        int lm = height[l];
        int rm = height[r];
        int area = 0;
        while (l < r) {
            if (lm < rm) {
                area += lm - height[l];
                l++;
                lm = Math.max(height[l], lm);
            } else {
                area += rm - height[r];
                r--;
                rm = Math.max(height[r], rm);
            }
        }
        return area;
    }
}
