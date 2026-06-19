import java.util.*;

public class reversal {

    public static void reverse(int Arr[], int start, int end) {

        while (start < end) {
            int temp = Arr[start];
            Arr[start++] = Arr[end];
            Arr[end--] = temp;
        }

    }

    public static void rotate(int Arr[], int k) {

        k = k % Arr.length;

        reverse(Arr, 0, Arr.length - 1);
        reverse(Arr, 0, k - 1);
        reverse(Arr, k, Arr.length - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(Arr, k);

        System.out.println(Arrays.toString(Arr));

        sc.close();

    }

}
