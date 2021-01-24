import java.lang.*;
class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        /*else if(nums.length==1){
            return nums[1];
        }*/
        
        int freq[]=new int[10001];
        int sum[]=new int[10001];
        int max=0;
        for(int i:nums){
            freq[i]++;
            if(i>max){
                max=i;
            }
        }
        sum[0]=freq[0];
        sum[1]=freq[1];
        
        for(int i=2;i<=max;i++){
            sum[i]=Math.max(sum[i-2]+freq[i]*i,sum[i-1]);
        }
        
        return sum[max];
    }
}
