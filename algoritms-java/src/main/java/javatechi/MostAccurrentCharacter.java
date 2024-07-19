package javatechi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostAccurrentCharacter {

    public static void main(String[] args) {
        String str = "ilovejavatechi";

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        List<String> duplicateChar = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()

                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicateChar);

        String maxKey = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getKey))
                .get().getKey();

        System.out.println(maxKey);

        String firstNoRepeatOcurrence = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("First no repeat occurence:: "+ firstNoRepeatOcurrence);

        int numbers [] = {1,2,3,4,9,15,21};

        Integer secondHigherElem = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Higher element:: "+ secondHigherElem);

        String strArr [] = {"Java", "PHP", "Docker", "Amazon", "Microservices"};

        String largestStr = Arrays.stream(strArr)
                .reduce((word1,word2) -> word1.length()>word2.length()?word1 : word2)
                .get();

        System.out.println("Largest string:: "+largestStr);


    }
}
