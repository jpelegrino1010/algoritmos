package maps.stringopenclose;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchOpenAndClose {

    public static void main(String[] args) {
        System.out.println(isFixed("()[]{}"));
        System.out.println(isFixed("([]){}"));
        System.out.println(isFixed("([){}"));
        System.out.println(isFixed("([]{}"));
    }

    public static boolean isFixed(String content) {
        String arr[] = content.split("");
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        Map<String,Integer> map = new HashMap<>();

        while (!stack.isEmpty()) {
            String key = stack.pop();

            if(key.equals("(")
                    || key.equals("{")
                    || key.equals("[") ) {
                if (map.get("open") == null) {
                    map.put("open",1);
                }else {
                    map.put("open",map.get("open")+1);
                }

            }else {
                map.put("none",1);
            }

            if(key.equals(")")
                    || key.equals("}")
                    || key.equals("]") ) {
                if(map.get("close") == null) {
                    map.put("close",1);
                }else {
                    map.put("close",map.get("close")+1);
                }

            }else {
                map.put("none",1);
            }

        }

        if (map.get("open") == map.get("close")) {
            return true;
        }

        return false;
    }
}
