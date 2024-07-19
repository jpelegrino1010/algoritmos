package free.tournament;

import java.util.HashMap;
import java.util.Map;

public class Tournament {
    public static void main(String[] args) {
        String [][] competitions = {
                {"HTML", "C#"},
                {"C#", "PYTHON"},
                {"PYTHON", "C#"}
        };

        int scores [] = {0,0,1};

        System.out.println(solution(competitions,scores));
    }

    public static String solution(String [][] competitions, int scores []) {
        String teamWinner = "";
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;

        for (String [] match : competitions) {
            if(map.size() == 0) {
                map.put(teamWinner,0);
                map.put(addMatchWinner(match,scores[count]),3);
            }else {
                String currentWinner = addMatchWinner(match,scores[count]);
                if(!map.containsKey(currentWinner)) {
                    map.put(currentWinner,3);
                }
                map.put(currentWinner,map.get(currentWinner) + 3);
            }
            count++;
        }

        System.out.println(map);
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                teamWinner = entry.getKey();
            }
        }

        return teamWinner;

    }

    private static String addMatchWinner(String[] match, int score) {
        String home = match[0];
        String away = match[1];
        return score == 1 ? home : away;
    }
}
