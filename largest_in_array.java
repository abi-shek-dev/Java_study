import java.util.*;

public class largest_in_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {

            arr[i] = sc.nextInt();

        }

        int large = arr[0];

        for (int i : arr) {

            if (i > large) {
                large = i;
            }

        }

        System.out.println(large);

        sc.close();

    }

}
