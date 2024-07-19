package free.chunkArray;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Chunk {
    public static void main(String[] args) {
         int arr [] = {1,2,3,4};
        int [][] arrays = chunkArray(arr,3);
        System.out.println(arrays);
       int anatherArray [][] = solution(arr,3);
        System.out.println(anatherArray);


    }

    private static int[][] solution(int[] arr, int size) {
        int [][] container = new int[arr.length][];
        int chunkNum = (int) Math.ceil((double) arr.length / size);

        for(int i = 0; i<chunkNum; i++) {
            int start = i * size;
            int length = Math.min(arr.length-start,size);
            int temp [] = new int[length];
            System.arraycopy(arr,start,temp,0,length);
            container[i]=temp;
        }

        for (int [] chunk : container) {
            if(Objects.nonNull(chunk)) {
                Integer sum= Arrays.stream(chunk).reduce(0,(a,b) -> a + b);
                System.out.println(sum);
            }

        }

        return container;

    }

    public static int[][] chunkArray(int[] array, int chunkSize) {
        int numOfChunks = (int)Math.ceil((double)array.length / chunkSize);
        int[][] output = new int[numOfChunks][];

        for(int i = 0; i < numOfChunks; ++i) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);

            int[] temp = new int[length];
            System.arraycopy(array, start, temp, 0, length);
            output[i] = temp;
        }

        return output;
    }


}
