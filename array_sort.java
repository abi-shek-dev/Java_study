import java.util.*;
import java.util.stream.*;

public class array_sort {

    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};
        int[] b = {4, 7, 6, 9, 0};

        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

        System.out.println("Sorted array: " + Arrays.toString(result));

    }

}
