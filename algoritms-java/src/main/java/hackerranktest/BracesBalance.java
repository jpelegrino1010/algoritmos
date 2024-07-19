package hackerranktest;

import java.util.Stack;

public class BracesBalance {
    public static void main(String[] args) {
        String str ="{}({)";
        String [] arr = {"{}()","{()}","({()})","({}()"};

        System.out.println(matchParenthisis(str));

//        for (String s : arr) {
//            System.out.println(matchParenthisis(s));
//        }

    }

    private static String matchParenthisis(String str) {
        Stack<Character> st = new Stack<Character> ();
        char[] ch = str.toCharArray();
        for (char c : ch) {

            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {

                if (c == ']' && !st.isEmpty() && st.pop() == '[') {
                    continue;

                } else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
                    continue;
                } else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
                    continue;
                } else {
                    return "NO";
                }

            }
        }
        if (!st.isEmpty()) {
            return "NO";
        }

        return "YES";

    }
}
