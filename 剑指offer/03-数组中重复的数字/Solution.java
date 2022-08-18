import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        
    }
    public int findRepeatNumber1(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return nums[i];
        }
        return -1;
    }
    public int findRepeatNumber2(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i:nums){
            ans[i]++;
            if(ans[i]>1)return i;
        }
        return -1;
    }
}