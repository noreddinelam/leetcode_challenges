package solution.day2;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        int length = nums.length;
        while (i < length) {
            int j = i;
            while (i < length && nums[i] == nums[i - 1]) {
                i++;
            }
            int l = i;
            for (int k = j + 1; k < l && l < length; k++, l++) {
                nums[k] = nums[l];
            }
            if (i != j) {
                length -= (i - j) - 1;
            }
            i = j;
            i++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int cpt = removeDuplicates(array);
        System.out.println(Arrays.toString(array));
        System.out.println(cpt);
    }
}
