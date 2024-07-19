package free.beautifuldays;

public class BeautifulDays {

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int n = i; n <= j; n++) {
            String reversed = new StringBuilder("" + n).reverse().toString();
            count = Math.abs(n - Integer.valueOf(reversed)) % k == 0 ? count + 1 : count;
        }
        return count;
    }

}
