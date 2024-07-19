package free.reverseintegel;

public class ReverseInt {
    public static void main(String[] args) {
        int num = solution(51);
        System.out.println(num);
    }

    private static int solution(int i) {
        boolean isNegative = false;
        if(i < 0) {
            i = i * (-1);
            isNegative = true;
        }
        String strNum = i+"";
        String reverse = "";

        for (String s : strNum.split("")) {
            reverse = s + reverse;
        }
        int result = isNegative ? -Integer.valueOf(reverse) :Integer.valueOf(reverse);
        return result;
    }
}
