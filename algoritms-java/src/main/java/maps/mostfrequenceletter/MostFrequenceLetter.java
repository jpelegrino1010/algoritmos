package maps.mostfrequenceletter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequenceLetter {

    public static void main(String[] args) {
        System.out.println(mostFrequence("Hoyesundiamuyespecialenmivida"));
        System.out.println(mostFrequence2("Hoyesundiamuyespecialenmivida"));
    }

    public static Character mostFrequence(String str) {
        Character ch=null;
        Integer maxLen=0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue()>maxLen) {
                maxLen=entry.getValue();
                ch = entry.getKey();
            }
        }

        return ch;
    }

    public static Character mostFrequence2(String str) {
        return Arrays.stream(str.split("")).
                    collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .get()
                    .getKey().charAt(0);
    }
}
