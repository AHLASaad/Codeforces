//https://codeforces.com/problemset/problem/268/A
import java.util.Scanner;

public class Games_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] home = new int[number];
        int[] guest = new int[number];
        for (int i = 0; i < number; i++) {
            home[i] = scanner.nextInt();
            guest[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (home[i] == guest[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
