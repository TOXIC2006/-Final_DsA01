package Day2;

class Solution01 {
    public int removeDuplicates(int[] nums) {
        int len= nums.length;
        int l=0;
        int r=1;
        if( len==0){
            return 0;
        }
        while( r<len){
            if( nums[l]!=nums[r]){
                nums[l+1]=nums[r];
                l++;
            }
            r++;
        }
        return l+1;
    }
}