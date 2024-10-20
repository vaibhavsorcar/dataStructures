import java.util.*;

public class Main {
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n < 0 ? -n : n;
        while (nn > 0) {
            if (nn % 2 == 1) ans *= x;
            x *= x;
            nn /= 2;
        }
        return n < 0 ? 1.0 / ans : ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
}
