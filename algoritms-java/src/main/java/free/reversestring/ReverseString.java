package free.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(solution("Hello"));
    }

    public static String solution(String str) {
        String reverse = "";
        String arr [] = str.split("");

        for (String c : arr) {
            reverse = c + reverse;
        }

        return  reverse;
    }
}
