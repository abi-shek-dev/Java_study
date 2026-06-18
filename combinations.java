public class combinations {

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 4;
        int p = 2;
        int e = 1;

        int ncp = factorial(n) / (factorial(p) * factorial(n - p));
        int mce = factorial(m) / (factorial(e) * factorial(m - e));

        System.out.println(ncp * mce);

    }

}
