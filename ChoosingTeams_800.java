//https://codeforces.com/problemset/problem/432/A
import java.util.Scanner;

public class ChoosingTeams_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        int[] yi = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            yi[i] = scanner.nextInt();
            if (yi[i] + k <= 5) {
                result++;
            }
        }
        System.out.println(result/3);

    }
}
