package maps.mostfrequenceletter;

import java.util.HashMap;
import java.util.Map;

public class MostFrequenceLetter {

    public static void main(String[] args) {
        System.out.println(mostFrequence("Hoyesundiamuyespecialenmivida"));
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
}
