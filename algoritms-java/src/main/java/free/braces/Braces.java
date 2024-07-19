package free.braces;

import java.util.Stack;

public class Braces {
    public static void main(String[] args) {
        String [] arr ={"{}()","{()}","({()})"};
        String [] arr2 ={"{}(","({)}","((","}{"};

        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);

        for (String s : arr2) {
            System.out.println(braceBalance(s));
        }
    }

    private static String braceBalance(String str) {
        Stack<Character> stack = new Stack<>();
        char arr [] = str.toCharArray();


        for(char c : arr) {
            if(c == '{' || c =='(') {
                stack.push(c);
            }else {
                if(c == '}' && !stack.isEmpty() && stack.pop() == '{') {
                    continue;
                }else if (c == ')' && !stack.isEmpty() && stack.pop() == '(') {
                    continue;
                }else {
                    return "false";
                }
            }
        }

        if(!stack.isEmpty()) {
            return "false";
        }

        return "true";


    }
}
