package free.twoNumerSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        int arr [] = {3,5,-4,8,11,-1,6};
        int result [] = soluction(arr,10);
        Arrays.stream(result).forEach(n -> System.out.println(n));
    }

    private static int[] soluction(int[] arr, int targetNum) {
        Set<Integer> nums = new HashSet<>();

        for (int num : arr) {
            int matchNum = targetNum - num;
            if(nums.contains(matchNum)) {
                return new int[] {matchNum, num};
            }else {
                nums.add(num);
            }
        }

        return new int[0];
    }
}
