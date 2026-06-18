import java.util.*;

public class first_target {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 6, 8, 9 };
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
        }

    }

}
