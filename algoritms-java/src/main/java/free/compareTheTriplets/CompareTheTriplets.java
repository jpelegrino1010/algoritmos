package free.compareTheTriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,16,8);

        System.out.println(compareTriplets(a,b));
        System.out.println(compareTriplets2(a,b));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (b.get(i) > a.get(i)) {
                bScore++;
            }
        }
        result.add(aScore);
        result.add(bScore);
        return result;
    }

    static List<Integer> compareTriplets2(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();
        int scorea = 0;
        int scoreb = 0;

        for(int i = 0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                scorea++;
            }else if (b.get(i) > a.get(i)) {
                scoreb++;
            }
        }

        scores.add(scorea);
        scores.add(scoreb);
        return scores;
    }
}
