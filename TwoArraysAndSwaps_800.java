//https://codeforces.com/problemset/problem/1353/B
import java.util.Scanner;

public class TwoArraysAndSwaps_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max = 1;
            int maxIndex = 0;
            int min = 30;
            int minIndex = 0;
            int tmp ;
            scanner.nextLine();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            scanner.nextLine();
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            if (k == 0) {

            } else {
                while (k != 0) {
                    for (int j = 0; j < n; j++) {
                        if (b[j] > max) {
                            max = b[j];
                            maxIndex = j;
                        }
                        if (a[j] < min) {
                            min = a[j];
                            minIndex = j;
                        }
                    }
                    if (min < max) {
                        tmp = b[maxIndex];
                        b[maxIndex] = a[minIndex];
                        a[minIndex] = tmp;
                    }
                    maxIndex = 0;
                    minIndex = 0;
                    max = 1;
                    min = 30;
                    k--;
                }
            }
            for (int j = 0; j < n; j++) {
                result[i] += a[j];
            }
            System.out.println(result[i]);
        }
    }
}
