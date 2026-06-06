package Day05;

class Solution02 {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int l=0;
        int sum= 0;
        int count=Integer.MAX_VALUE;
        for( int r=0;r<n;r++){
            sum=sum+nums[r];
            while(sum>=target){
                count= Math.min(count,r-l+1);
                sum=sum-nums[l];
                l++;
            }
        }

        if( count==Integer.MAX_VALUE){
            return 0;
        }
        return count;
    }
}
