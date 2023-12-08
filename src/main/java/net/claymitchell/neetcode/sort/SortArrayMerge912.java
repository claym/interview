package net.claymitchell.neetcode.sort;

public class SortArrayMerge912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public int[] mergeSort(int[] nums, int s, int e) {
        if(e-s+1 <= 1) {
            return nums;
        }
        int m = (s + e) / 2;
        mergeSort(nums, s, m);
        mergeSort(nums, m+1, e);
        merge(nums, s, m, e);
        return nums;
    }

    public void merge (int[] nums, int s, int m, int e) {

        int[] left = new int[m-s+1];
        int[] right = new int[e-m];
        for(int i = 0; i<left.length; i++) {
            left[i] = nums[s + i];
        }
        for(int i = 0; i<right.length; i++) {
            right[i] = nums[m + i + 1];
        }
        int i = 0;
        int j = 0;
        int k=s; // start array


        while(i<left.length && j < right.length) {
            if(left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length) {
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length) {
            nums[k] = right[j];
            j++;
            k++;
        }
        return;
    }
}
