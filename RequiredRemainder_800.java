//https://codeforces.com/problemset/problem/1374/A
import java.util.Scanner;

public class RequiredRemainder_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();
            int a = n / x;
            int k = x * a + y;
            if (k > n) {
                k -= x;
            }
            System.out.println(k);

        }
    }
}
