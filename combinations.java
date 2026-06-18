public class combinations {

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        int n = 5;
        int m = 3;
        int p = 3;
        int e = 2;

        int ncp = factorial(n) / (factorial(p) * factorial(n - p));
        int mce = factorial(m) / (factorial(e) * factorial(m - e));

        System.out.println(ncp * mce);

    }

}
