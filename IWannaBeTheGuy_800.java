//https://codeforces.com/problemset/problem/469/A
import java.util.Scanner;

public class IWannaBeTheGuy_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int levels = scanner.nextInt();
        int count = 0;
        scanner.nextLine();
        int x = scanner.nextInt();
        int[] xLevels = new int[x];
        for (int i = 0; i < x; i++) {
            xLevels[i] = scanner.nextInt();
        }
        scanner.nextLine();
        int y = scanner.nextInt();
        int[] yLevels = new int[y];
        for (int i = 0; i < y; i++) {
            yLevels[i] = scanner.nextInt();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (xLevels[i] == yLevels[j]) {
                    count++;
                }
            }
        }
        if (x + y - count == levels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
