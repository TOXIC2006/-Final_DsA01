package Day05;

import java.util.*;

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum =sum;

        int l = 0;
        int r = k - 1;

        while (r < n - 1) {
            r++;
            sum = sum + arr[r] - arr[l];
            maxSum = Math.max(maxSum, sum);
            l++;
        }

        return maxSum;
    }
}