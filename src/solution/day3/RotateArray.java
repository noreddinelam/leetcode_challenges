package solution.day3;

import java.util.Arrays;

public class RotateArray {

    // rotate an array with O(n) time & O(1) space
    public static void rotate(int[] nums, int k) {
        int nb = 0;
        int i = 0;
        int val = nums[0];
        int startingCycle = 0;
        int temp;
        while (nb < nums.length) {
            temp = nums[(i + k) % nums.length];
            nums[(i + k) % nums.length] = val;
            val = temp;
            i = (i + k) % nums.length;
            if (i == startingCycle) {
                i = (i + 1) % nums.length;
                val = nums[i];
                startingCycle = i;
            }
            nb++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {-1,-100,3,99};
        int k = 2;
        rotate(array, k);
        System.out.println(Arrays.toString(array));
    }
}
