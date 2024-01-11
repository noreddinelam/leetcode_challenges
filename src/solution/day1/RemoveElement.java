package solution.day1;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int cpt = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == val) {
                j++;
            }
            if (j < nums.length) {
                if (j != i) {
                    nums[i] = nums[j];
                    nums[j] = val;
                }
                i++;
                cpt++;
            } else {
                break;
            }
        }
        return cpt;
    }

    public static void main(String[] args) {
        int[] array = new int[] {0,1,2,2,3,0,4,2};
        int cpt = removeElement(array, 2);
        System.out.println(Arrays.toString(array));
    }
}
