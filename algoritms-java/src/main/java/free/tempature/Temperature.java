package free.tempature;

import java.util.Arrays;

public class Temperature {

    public static void main(String[] args) {
        int [] temperatures = {5,-5,2,6};
        int closestToZero = solution(temperatures);
        System.out.println(closestToZero);
    }

    private static int solution(int[] temperatures) {
        int curr = 0;
        int near = temperatures[0];
        Arrays.sort(temperatures);      //  add this
        // find the element nearest to zero
        for ( int i=0; i < temperatures.length; i++ ){
            curr = temperatures[i] * temperatures[i];
            if ( curr <= (near * near) )  {
                near = temperatures[i];
            }
        }
        return near;
    }
}
