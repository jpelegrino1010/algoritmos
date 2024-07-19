package free.wordsplit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordSplit {

    public static void main(String[] args) {
        String arr [] = {"hellocat","apple,bat,cat,goodbye,hello,yellow,why"};
        System.out.println(solution(arr));
    }

    public static String solution(String ... arr) {
        String first = arr[0];
        String second [] = arr[1].split(",");

        Set<String> groupOfWords = new HashSet<>(Arrays.asList(second));
        String temp [] = new String[2];

        for (int i = 0; i<first.length(); i++) {
            String firstWord = first.substring(0,i);

            if(groupOfWords.contains(firstWord)) {
                if(temp[0] == null) {
                    temp[0] = firstWord;
                }
            }

            String lastWord = first.substring(i);
            if(groupOfWords.contains(lastWord)) {
                temp[1] = lastWord;
                break;
            }
        }

        if(!first.equals(temp[0]+temp[1])) {
            return "no possible";
        }

        return temp[0] + ","+ temp[1];
    }
}
