//https://codeforces.com/problemset/problem/1367/B
import java.util.Scanner;

public class EvenArray_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] array = new int[n];
            int noneEven = 0;
            int noneOdd = 0;
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
                if (array[j] % 2 != j % 2) {
                    if (array[j] % 2 == 0) {
                        noneOdd += 1;
                    } else noneEven += 1;
                }
            }
            if (noneEven == noneOdd) {
                result[i] = noneEven;
            } else result[i] = -1;

        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
