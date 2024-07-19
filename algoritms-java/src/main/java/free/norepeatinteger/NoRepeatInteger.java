package free.norepeatinteger;

import java.util.*;

public class NoRepeatInteger {

    public static void main(String[] args) {
        List<Integer> list = solution(Arrays.asList(1,2,3,5,5,2,1,4));
        System.out.println(list);
    }

    private static List<Integer> solution(List<Integer> asList) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (Integer key : asList) {
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }


}
