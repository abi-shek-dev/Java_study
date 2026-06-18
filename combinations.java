import java.util.*;

public class combinations {

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();

        int ncp = factorial(n) / (factorial(p) * factorial(n - p));
        int mce = factorial(m) / (factorial(e) * factorial(m - e));

        System.out.println(ncp * mce);

    }

}
