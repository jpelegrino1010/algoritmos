package free.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solution("abba"));
    }

    public static boolean solution(String str) {
       String reverse = reversed(str);
        return str.contains(reverse);
    }

    private static String reversed(String str) {
        String reverse = "";
        for (String s : str.split("")) {
            reverse = s + reverse;
        }
        return reverse;
    }
}
