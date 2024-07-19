package free.anagrams;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        boolean result = solution("rail safety!","fairy! tales");
        System.out.println(result);

        String str ="Hello world";
        System.out.println(str.replace(" ",""));


    }

    private static boolean solution(String s1, String s2) {
        if (s1.length() != s2.length())
        return false;

        String str1 = s1.toLowerCase().replace(" ","");
        String str2 = s2.toLowerCase().replace(" ","");

        char c1 [] = str1.toCharArray();
        char c2 [] = str2.toCharArray();

//        boolean dirty1 = isDirty(c1);
//        boolean dirty2 = isDirty(c2);
//
//        if (dirty1 || dirty2) return false;

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (!Arrays.equals(c1,c2)) return false;

        return true;
    }

    private static boolean isDirty(char[] arr) {
        for (char ch : arr) {
            if(!Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }
}
