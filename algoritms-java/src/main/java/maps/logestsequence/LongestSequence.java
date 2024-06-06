package maps.logestsequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array count the number of time each number apear in the array
 */
public class LongestSequence {

    public static void main(String[] args) {
        System.out.println(longestSequence(new int[] {2,2,2,3,3,3,3,4,5,5,5,6,6,6}));
    }

    public static Map<Integer,Integer> longestSequence(int arr []) {
        int temp = arr[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == temp) {
                map.put(temp,map.getOrDefault(temp,1)+1);
            }else {
                temp = arr[i];
            }
        }

        return map;
    }
}
