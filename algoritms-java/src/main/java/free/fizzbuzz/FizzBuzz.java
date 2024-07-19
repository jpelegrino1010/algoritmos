package free.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        solution(15);
    }

    private static void solution(int n) {
        for (int i = 1; i<=n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("fizzbuzz");
            }else if(i%5 == 0) {
                System.out.println("buzz");
            }else if(i%3 == 0) {
                System.out.println("fizz");
            }else {
                System.out.println(i);
            }
        }

    }
}
