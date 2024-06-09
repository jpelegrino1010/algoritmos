package maps.logestsequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array count the number of time each number apear in the array
 */
public class LongestSequence {

    public static void main(String[] args) {
        System.out.println(longestSequence(new int[] {2,2,2,3,3,3,3,4,5,5,5,6,6,6}));
        System.out.println(longestSequence2(new int[] {2,2,2,3,3,3,3,4,5,5,5,6,6,6}));
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

    public static Map<Integer,Integer> longestSequence2(int arr []) {
        int temp = arr[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == temp) {
                if(map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }else {
                    map.put(arr[i],1);
                }
            }else {
                temp = arr[i];
                map.put(arr[i],1);
            }
        }

        return map;
    }

}
