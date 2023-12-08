package net.claymitchell.neetcode.sort;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        //mergeSort(nums, 0, nums.length-1);
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public int[] quickSort(int[] nums, int s, int e) {
        if (e - s + 1 <= 1) {
            return nums;
        }
        int pivot = nums[e];
        int left = s;
        for (int i = s; i < e; i++) {
            if (nums[i] < pivot) {
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
                left++;
            }
        }
        nums[e] = nums[left];
        nums[left] = pivot;
        quickSort(nums, s, left - 1);
        quickSort(nums, left + 1, e);
        return nums;
    }
}
