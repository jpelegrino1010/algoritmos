package maps.sparsearrays;

import java.util.*;

public class SparseArrays {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ab","abc","ab");
        List<String> queries = Arrays.asList("ab","abc","bc");

        System.out.println(matchingStrings(stringList,queries));
        System.out.println(matchingStrings2(stringList,queries));
    }
    static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> counter = new HashMap<>();
        for (String current: strings) {
            counter.put(current, counter.getOrDefault(current, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            list.add(counter.getOrDefault(queries.get(i), 0));
        }

        return list;
    }

    static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        Map<String,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (String key : strings) {
            if (map.containsKey(key)) {
                map.put(key,map.get(key) + 1);
            }else {
                map.put(key,1);
            }
        }

        for (String key : queries) {
            if (map.containsKey(key)) {
                result.add(map.get(key));
            }else {
                result.add(0);
            }
        }

        return result;
    }
}
