package free.breakingrecores;

import java.util.Arrays;

public class BreakingRecords {

    public static void main(String[] args) {
//       for (int n : breakingRecords2(10, 5, 20, 20, 4, 5, 2, 25, 1)) {
//           System.out.println(n);
//       }

        for (int n : breakingRecords3(10, 5, 20, 20, 4, 5, 2, 25, 1)) {
            System.out.println(n);
        }
    }

    static int[] breakingRecords(int ... scores) {
        int minRecord = scores[0];
        int maxRecord = scores[0];
        int minRecordCount = 0;
        int maxRecordCount = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxRecord) {
                maxRecord = scores[i];
                maxRecordCount++;
            } else if (scores[i] < minRecord) {
                minRecord = scores[i];
                minRecordCount++;
            }
        }
        int[] record = new int[2];
        record[0] = maxRecordCount;
        record[1] = minRecordCount;
        return record;
    }

    static int [] breakingRecords2(int ... scores) {
        int minScore = scores[0];
        int maxScore = scores[0];

        int minScoreCount = 0;
        int maxScoreCount = 0;

        for (int i = 0; i<scores.length; i++) {
            if(scores[i]> maxScore) {
                maxScore = scores[i];
                maxScoreCount++;
            }

            if (scores[i] < minScore) {
                minScore = scores[i];
                minScoreCount++;
            }
        }

        int records [] = new  int[2];
        records[0] = maxScoreCount;
        records[1] = minScoreCount;

        return records;

    }

    static int [] breakingRecords3(int ... scores) {
        int minScore = scores[0];
        int maxScore = scores[0];

        int min = 0, max = 0;

        for (int i = 0; i<scores.length; i++) {
            if(scores[i]> maxScore) {
                maxScore = scores[i];
                max++;
            }else if(scores[i] < minScore) {
                minScore = scores[i];
                min++;
            }

        }

        int list [] = new int[2];
        list[0] = min;
        list[1] = max;

        return list;
    }
}
