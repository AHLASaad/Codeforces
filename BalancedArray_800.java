//https://codeforces.com/problemset/problem/1343/B
import java.util.Scanner;

public class BalancedArray_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[t];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < t; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < t; i++) {
            if ((numbers[i] / 2) % 2 == 0 && (numbers[i] / 2) >= 2) {
                System.out.println("YES");
                for (int j = 1; j < (2 * (numbers[i] / 2)) + 1; j++) {
                    if (j % 2 == 0) {
                        sum1 += j;
                        System.out.print(j+" ");
                    }
                }
                sum2 = sum1;
                for (int j = 1; j < (2 * (numbers[i] / 2) - 1); j++) {
                    if (j % 2 != 0) {
                        sum2 += j;
                        System.out.print(j+" ");
                    }
                }
                int z = sum2 - sum1;
                sum2 = sum1 - z;
                System.out.print(sum2);
                System.out.println();
                sum1 = 0;
            }else System.out.println("NO");
        }
    }
}
