//https://codeforces.com/problemset/problem/1360/B
import java.util.Scanner;

public class HonestCoach_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] si = new int[n];
            for (int j = 0; j < n; j++) {
                si[j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }
}
