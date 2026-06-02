package Day2;

import java.util.Arrays;
class Solution02 {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        for( int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}