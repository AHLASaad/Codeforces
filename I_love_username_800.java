//https://codeforces.com/problemset/problem/155/A
import java.util.Scanner;

public class I_love_username_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        int max = 0, min = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        if (n == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    max = array[i];
                    min = array[i];
                }
                if (array[i] > max) {
                    count++;
                    max = array[i];
                } else if (array[i] < min) {
                    count++;
                    min = array[i];
                }
            }
            System.out.println(count);

        }

    }
}

