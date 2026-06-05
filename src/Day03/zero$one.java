package Day03;

class Solution {
    void segregate0and1(int[] arr) {
        int l=0;
        int r= arr.length-1;

        while(l<=r){
            if( arr[l]==1 && arr[r]==0){
                int temp= arr[l];
                arr[l]= arr[r];
                arr[r]= temp;
            }
            if(arr[l]==0){
                l++;
            } if(arr[r]==1){
                r--;
            }
        }

    }
}
