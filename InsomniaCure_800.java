//https://codeforces.com/problemset/problem/148/A
import java.util.Scanner;

public class InsomniaCure_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, l, m, n, d;
        k = scanner.nextInt();
        l = scanner.nextInt();
        m = scanner.nextInt();
        n = scanner.nextInt();
        d = scanner.nextInt();
        int count = d;
        if (k == 1 || l == 1 || m == 1 | n == 1) {
            System.out.println(d);
        } else {
            for (int i = 1; i <= d; i++) {
                if ((i % k != 0) && (i % l != 0) && (i % m != 0) && (i % n != 0)) {
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}
