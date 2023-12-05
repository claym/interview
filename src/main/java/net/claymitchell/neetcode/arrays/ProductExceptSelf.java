package net.claymitchell.neetcode.arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        prefix[0] = 1;
        for(int i=1; i<length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        suffix[length-1] = 1;
        for(int i=length-2; i>=0; i--) {
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for(int i=0; i<length; i++) {
            answer[i] = suffix[i]*prefix[i];
        }
        return answer;
    }
}
