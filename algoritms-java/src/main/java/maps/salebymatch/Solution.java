package maps.salebymatch;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int arr []={10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(9,arr));
        System.out.println(sockMerchant2(9,arr));
    }

    static int sockMerchant(int n, int[] ar) {
//        1) initialize a map to store the pairs
        Map<Integer, Integer> colorsCount = new HashMap<>();

//        2)Loop through the array
        for (int i = 0; i < ar.length; i++) {
//            3) if the current value not found in map put a 1 into the map
//            3) if not add 1 to existing key
            if (colorsCount.get(ar[i]) == null) {
                colorsCount.put(ar[i], 1);
            } else {
                colorsCount.put(ar[i], colorsCount.get(ar[i]) + 1);
            }
        }
//        4) initialize an integer to 0
        int pairs = 0;
//        5) Loop through the map
        for (Map.Entry<Integer, Integer> entry : colorsCount.entrySet()) {
//            6) sum pair value + current value divide by 2
            pairs += entry.getValue() / 2;
        }
//        7) return the sum of pairs
        return pairs;
    }

    static int sockMerchant2(int n, int[] ar) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : ar) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num) + 1);
            }else {
                map.put(num,1);
            }
        }

        int pairs = 0;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pairs+= entry.getValue() / 2;
        }

        return pairs;
    }
}
