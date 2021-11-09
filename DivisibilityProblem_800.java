//https://codeforces.com/problemset/problem/1328/A
import java.util.Scanner;

public class DivisibilityProblem_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < t; i++) {
            if (a[i] % b[i] == 0) {
                System.out.println(0);
            }else System.out.println(b[i] - (a[i] % b[i]));

        }
    }
}
