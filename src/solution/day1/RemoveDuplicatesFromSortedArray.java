package solution.day1;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    //in place (if it was not in place we can use sorted set to do it)
    // I wanted just to see this manner how much time it takes (there is better solution for this)
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        int length = nums.length;
        while (i < length) {
            int j = i;
            while (i < length && nums[i] == nums[i - 1]) {
                i++;
            }
            int l = i;
            for (int k = j; l < length; k++, l++) {
                nums[k] = nums[l];
            }
            length -= (i - j);
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
