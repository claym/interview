package net.claymitchell.neetcode.binarysearch;

public class SearchArray {
    public int search(int[] nums, int target) {
        //int result = binarySearch(nums, target, 0, nums.length-1);
        if(nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int L = 0;
        int R = nums.length-1;
        while(L<=R) {
            int M = (L + R) / 2;
            if(nums[M] < target) {
                L = M + 1;
            } else if(nums[M] > target) {
                R = M -1;
            } else {
                return M;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int L, int R) {
        int M = (L + R) / 2;

        return -9999;
    }
}
