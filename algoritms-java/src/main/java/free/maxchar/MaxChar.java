package free.maxchar;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {
    public static void main(String[] args) {
        char c = solution("abcccccd");
        System.out.println(c);
    }

    private static char solution(String str) {
        Map<Character,Integer> map = new HashMap<>();
        Character ch = null;
        int max = 0;

        for (char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                ch = entry.getKey();
            }
        }

        return ch;
    }
}
