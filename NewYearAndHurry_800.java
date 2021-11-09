//https://codeforces.com/problemset/problem/750/A
import java.util.Scanner;

public class NewYearAndHurry_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            sum += 5 * i;
            if (sum > (240 - k)) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
