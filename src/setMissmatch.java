//import java.util.*;
//
//public class setMissmatch {
//    int n = nums.length;
//    int i = 0;
//        while (i < n) {
//        int correct = nums[i] - 1;
//        if (nums[i] != nums[correct]) {
//            swap(nums, i, correct);
//        } else {
//            i++;
//        }
//    }
//        for (int index = 0; index < n; index++) {
//        if (nums[index] != index + 1) {
//            return new int[]{nums[index], index + 1};
//        }
//    }
//        return new int[]{-1, -1};
//}
//private void swap(int[] arr, int i, int j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//}
//
