package Day06;

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int l=0;
        int count =1;

        if(n==0){
            return 0;

        }
        Map<Character,Integer> fre= new HashMap<>();
        for( int h=0;h<n;h++){
            char ch= s.charAt(h);
            fre.put(ch,fre.getOrDefault(ch,0)+1);
            int k=h-l+1;
            while(fre.size()<k){
                char ele= s.charAt(l);
                fre.put( ele,fre.get(ele)-1);
                if(fre.get(ele)==0){
                    fre.remove(ele);
                }
                l++;
                k=h-l+1;
            }
            if(fre.size()==k){
                count= Math.max(count,h-l+1);

            }

        }

        return count;
    }
}