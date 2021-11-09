//https://codeforces.com/problemset/problem/492/B

import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns_1200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        
    }
}
