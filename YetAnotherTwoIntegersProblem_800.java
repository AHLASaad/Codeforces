//https://codeforces.com/problemset/problem/1409/A
import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] c = new int[t];
        int[] count = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            scanner.nextLine();
            if (a[i] >= b[i]) {
                c[i] = a[i] - b[i];
            }
            if (b[i] >= a[i]) {
                c[i] = b[i] - a[i];
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 10; j >= 2; j--) {
                if (c[i] / j != 0) {
                    count[i] += c[i] / j;
                    c[i] -= (c[i] / j) * j;
                }
            }
            if (c[i] == 1) {
                count[i]++;
            }
            System.out.println(count[i]);
        }
    }
}
