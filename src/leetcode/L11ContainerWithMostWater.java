package leetcode;

public class L11ContainerWithMostWater {

    public int maxArea(final int[] height) {
        int left = 0;
        int right = height.length - 1;
        int curLHeight = height[0];
        int curRHeight = height[right];
        int mArea = (height.length - 1) * Math.min(curLHeight, curRHeight);
        while (left < right) {
            if (height[left] >= height[right]) {
                if (height[right] >= curRHeight) {
                    final int area = (right - left) * height[right];
                    mArea = Math.max(area, mArea);
                    curRHeight = height[right];
                }
                right--;
            } else {
                if (height[left] >= curLHeight) {
                    final int area = (right - left) * height[left];
                    mArea = Math.max(area, mArea);
                    curLHeight = height[left];
                }
                left++;
            }
        }

        return mArea;
    }
}
