package Day2.squareofsorted;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int x = 0; //  negative numbers

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                x++;
            }
        }

        int[] neg = new int[x];
        int[] pos = new int[n - x];

        int ni = 0, pi = 0;


        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg[x - ni - 1] = nums[i];
                ni++;
            } else {
                pos[pi++] = nums[i];
            }
        }

        int[] ans = new int[n];
        int i = 0, j = 0, k = 0;

        // Merge sort
        while (i < x && j < n - x) {
            int negSq = neg[i] * neg[i];
            int posSq = pos[j] * pos[j];

            if (negSq <= posSq) {
                ans[k++] = negSq;
                i++;
            } else {
                ans[k++] = posSq;
                j++;
            }
        }

        while (i < x) {
            ans[k++] = neg[i] * neg[i];
            i++;
        }

        while (j < n - x) {
            ans[k++] = pos[j] * pos[j];
            j++;
        }

        return ans;
    }
}