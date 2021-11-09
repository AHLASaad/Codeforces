//https://codeforces.com/problemset/problem/1399/B
import java.util.Scanner;

public class GiftsFixing_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] a = new int[n];
            int[] b = new int[n];
            int min_a = 1000000000;
            int min_b = 1000000000;
            int count = 0;
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                if (a[j] < min_a) {
                    min_a = a[j];
                }
            }
            scanner.nextLine();
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
                if (b[j] < min_b) {
                    min_b = b[j];
                }
            }
            for (int j = 0; j < n; j++) {
                count += Integer.max(a[j] - min_a, b[j] - min_b);
            }
            result[i] = count;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
