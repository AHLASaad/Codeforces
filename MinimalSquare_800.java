//https://codeforces.com/problemset/problem/1360/A
import java.util.Scanner;

public class MinimalSquare_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = 0;
            scanner.nextLine();
            result[i] = Integer.min(a, b) * 2;
            temp = Integer.max(a, b);
            result[i] = Integer.max(temp, result[i]);
            result[i] *= result[i];
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
