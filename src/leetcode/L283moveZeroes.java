package leetcode;

public class L283moveZeroes {
    public void moveZeroes(int[] nums) {
        for( int j = 0, i = 0; j<nums.length;j++){
            if(nums[j]==0) continue;
            swap(i,j, nums);
            i++;
        }
    }

    void swap(int i, int j, int[] nums){
        if(i==j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
