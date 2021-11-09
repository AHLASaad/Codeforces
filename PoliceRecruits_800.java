//https://codeforces.com/problemset/problem/427/A
import java.util.Scanner;

public class PoliceRecruits_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[n];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if (sum < 0) {
                count++;
                sum = 0;
            }
        }
        System.out.println(count);

    }
}
