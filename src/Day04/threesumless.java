package Day04;

import java.util.*;
class Solution {
    int countTriplets(int sum, int arr[]) {
        int count =0;
        int n=arr.length;

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if( i>0 && arr[i]==arr[i-1]){
                continue;
            }

            int  l= i+1;
            int r =n-1;



            while(l<r){

                int target= arr[i]+ arr[l]+ arr[r];

                if( target>=sum){
                    while (l < r && arr[l] == arr[l + 1]) l++;
                    while (l < r && arr[r] == arr[r - 1]) r--;


                    r--;
                }if(target<sum ){

                    count=count+(r-l);
                    l++;

                }

            }
        }


        return count;

    }
}