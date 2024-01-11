package solution.day1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(n + m, Integer::compareTo);
        int i = 0;
        while (i < m && i < n) {
            queue.add(nums1[i]);
            queue.add(nums2[i]);
            i ++;
        }
        while (i < m) {
            queue.add(nums1[i]);
            i ++;
        }

        while (i < n) {
            queue.add(nums2[i]);
            i ++;
        }
        i = 0;
        while (!queue.isEmpty()) {
            nums1[i] = queue.poll();
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
