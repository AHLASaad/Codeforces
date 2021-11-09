//https://codeforces.com/problemset/problem/337/A
import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();
        int[] puzzles = new int[m];
        for (int i = 0; i < m; i++) {
            puzzles[i] = scanner.nextInt();
        }
        Arrays.sort(puzzles);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m - n + 1; i++) {
            min = Math.min(min, puzzles[i+n-1] - puzzles[i]);
        }
        System.out.println(min);

    }
}
