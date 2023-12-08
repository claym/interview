package net.claymitchell.neetcode.sort;

public class InsertionSort {
    public int[] sortArray(int[] nums) {
        // start at 1 because 0 is == to self
        for(int i=1; i<nums.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(nums[j] > nums[j+1]) {
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
