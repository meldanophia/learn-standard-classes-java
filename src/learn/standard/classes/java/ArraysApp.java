package learn.standard.classes.java;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,531,542,7,98,37,63,21,49,84
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 7, 21, 37, 49, 63, 84, 98, 531, 542]
        System.out.println(Arrays.binarySearch(numbers, 7)); // 1

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result)); // [1, 7, 21, 37, 49]

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2)); // [63, 84, 98, 531, 542]

    }
}
