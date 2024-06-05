package drawingbook;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pageCount(5,3));
    }

    static int pageCount(int n, int p) {
        if (n == p) {
            return 0;
        }
        int rightSide = 0;
        if (n % 2 == 0 && n - p == 1) {
            rightSide = 1;
        } else {
            rightSide = ((n - p - 1) / 2) + ((n - p - 1) % 2);
        }
        int leftSide = ((p - 1) / 2) + ((p - 1) % 2);
        return leftSide < rightSide ? leftSide : rightSide;
    }
}
