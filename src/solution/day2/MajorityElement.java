package solution.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> occ = new HashMap<>();
        for (int num : nums) {
            occ.put(num, occ.getOrDefault(num, 0) + 1);
        }
        return occ.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(0);
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int majorityElement = majorityElement(array);
        System.out.println(majorityElement);
    }
}
